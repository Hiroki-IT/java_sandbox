import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.io.FileReader;
import java.io.Reader;

/**
 * mainメソッド実行クラス
 * 
 */
public class TemplateTester
{
    /**
     * mainメソッド
     * 
     * @param String
     * @throws IOException
     */
    public static void main(String... args) throws IOException
    {
        try(
            Reader tReader = new FileReader("template.txt");
            Reader rReader = new FileReader("replacementTable.txt");
        ) {
            Template template = TemplateParser.parse(tReader);
            Map<String, List<String>> table = ReplacementTableParser.parse(rReader);
            System.out.print(template.apply(table));
        }
    }
}