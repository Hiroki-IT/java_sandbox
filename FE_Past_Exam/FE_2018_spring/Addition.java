package FE_2018_spring;// namespace宣言に相当

/**
 * ライブラリ
 *
 * 加法数式クラス
 */
public class Addition extends BinaryOperatorExpression implements Expression
{
    /**
     * コンストラクタ
     *
     * @param left  the left
     * @param right the right
     */
    public Addition(Expression left, Expression right)
    {
        super(left, right);
    }


    /**
     * 加法の結果を返却
     *
     * @return int int
     */
    public int evaluate()
    {
        return this.getLeft + this.getRight;
    }

    /**
     * 加法の記号を返却
     *
     * @return Stirng
     */
    protected String getOperator()
    {
        return "+";
    }

}