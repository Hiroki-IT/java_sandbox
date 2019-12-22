import java.util.Map;
import java.util.List;

/**
 * 非置換フラグメントクラス
 */
public class PassThrough implements Fragment
{
    final String string; 

    /**
     * コンストラクタ
     * 
     * @param CharSequence
     */
    PassThrough(CharSequence cs)
    {
        string = cs.toString();
    }

    /**
     * テキストを返却
     * 
     * @param Map
     */
    public String replace(Map<String, List<String>> table)
    {
        return string;
    }
}