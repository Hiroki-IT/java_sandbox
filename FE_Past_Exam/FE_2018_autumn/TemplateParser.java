package FE_2018_autumn;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * 雛形生成体クラス
 */
public class TemplateParser
{
    /**
     * フラグメントから生成した雛形を返却
     *
     * @param reader the reader
     *
     * @return Template template
     *
     * @throws IOException the io exception
     */
    static public Template parse(Reader reader) throws IOException
    {
        StringBuilder buf = new StringBuilder();

        List<Fragment> fragmentList = new ArrayList<Fragment>();

        int c;

        while ((c = reader.read()) >= 0) { // 1回目に一文字目だけを読み込んで文字コードで返却。2回目は二文字目だけ。無くなると、-1を返却。
            switch (c) {
                case '<': // defaultで、一文字ずつビルダーに追加していき、"<"になった時
                    fragmentList.add(new PassThrough(buf)); // テキストを非置換フラグメントして、フラグメントリストに格納
                    buf = new StringBuilder();
                    break;
                case '>': // defaultで、一文字ずつビルダーに追加していき、">"になった時
                    fragmentList.add(new Replacer(buf)); // テキストを置換フラグメントとして、フラグメントリストに格納
                    buf = new StringBuilder();
                    break;
                default: // "<"と">"以外の時
                    buf.append((char) c); // テキストをStringBuilderクラスに設定
            }
        }

        fragmentList.add(new PassThrough(buf)); // フラグメントを生成
        return new Template(fragmentList);
    }
}