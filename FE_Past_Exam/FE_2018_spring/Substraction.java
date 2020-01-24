package FE_2018_spring;

/**
 * ライブラリ
 *
 * 減法数式クラス
 */
public class Substraction extends BinaryOperatorExpression implements Expression
{
    /**
     * コンストラクタ
     *
     * @param left  the left
     * @param right the right
     */
    public Substraction(Expression left, Expression right)
    {
        super(left, right);
    }

    /**
     * 減法の結果を返却
     *
     * @return int int
     */
    public int evaluate()
    {
        return this.getLeft - this.getRight;
    }

    /**
     * 減法の記号を返却
     *
     * @return Stirng operator
     */
    protected String getOperator()
    {
        return "-";
    }
}