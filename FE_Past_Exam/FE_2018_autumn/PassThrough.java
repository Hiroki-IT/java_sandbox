package FE_2018_autumn;

import java.util.Map;
import java.util.List;

/**
 * 非置換フラグメントクラス
 */
public class PassThrough implements Fragment
{
    /**
     * The String.
     */
    final String string;

    /**
     * コンストラクタ
     *
     * @param cs the cs
     */
    PassThrough(CharSequence cs)
    {
        string = cs.toString();
    }

    /**
     * テキストを返却
     *
     * @param table the table
     *
     * @return the string
     */
    public String replace(Map<String, List<String>> table)
    {
        return string;
    }
}