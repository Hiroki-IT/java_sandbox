package FE_2018_autumn;

import java.util.List;
import java.util.Map;

/**
 * 置換フラグメントクラス
 */
public class Replacer implements Fragment
{
    /**
     * The Key.
     */
    final String key;

    /**
     * コンストラクタ
     *
     * @param cs the cs
     */
    Replacer(CharSequence cs)
    {
        key = cs.toString(); // Objectクラスのメソッドを使用
    }

    /**
     * 置換後のテキストを返却
     *
     * @param table the table
     *
     * @return the string
     */
    public String replace(Map<String, List<String>> table)
    {
        return String.join("\n", table.get(key)); // Map.get(key): キーに対応する値を返却 ⇄ Map.put(key)
    }
}