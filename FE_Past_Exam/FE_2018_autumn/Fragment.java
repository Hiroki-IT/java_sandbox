package FE_2018_autumn;

import java.util.List;
import java.util.Map;

/**
 * 置換部分と非置換部分（フラグラメント）インターフェーズ
 */
public interface Fragment
{
    /**
     * Replace string.
     *
     * @param table the table
     *
     * @return string
     */
    String replace(Map<String, List<String>> table); // Map<キーのデータ型, 値のデータ型>
}

