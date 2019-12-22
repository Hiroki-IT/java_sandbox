import java.util.List;
import java.util.Map;

/**
 * 置換フラグメントクラス
 */
public class Replacer implements Fragment
{
    final String key;

    /**
     * コンストラクタ
     * 
     * @param CharSequence
     */
    Replacer(CharSequence cs)
    {
        key = cs.toString(); // Objectクラスのメソッドを使用
    }

    /**
     * 置換後のテキストを返却
     * 
     * @param Map
     */
    public String replace(Map<String, List<String>> table)
    {
        return String.join("\n", table.get(key)); // Map.get(key): キーに対応する値を返却 ⇄ Map.put(key)
    }
}