package FE_2018_spring; // namespace宣言に相当

/**
 * ライブラリ
 *
 * 定数数式クラス
 */
public class Constant implements Expression
{
    private final int value; // コンストラクタでしか変更できない

    /**
     * コンストラクタ
     *
     * @param value the value
     */
    public Constant(int value)
    {
        this.value = value;
    }

    /**
     * 定数の値を返却
     *
     * @return int int
     */
    public int evaluate()
    {
        return value;
    }

    /**
     * 数値を文字列に変換して返却
     *
     * @return String
     */
    public String toString()
    {
        return String.valueOf(value);
    }
}