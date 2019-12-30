package com.example.expr;

public abstract class BinaryOperatorExpression implements Expression
{
    private final Expression left; // コンストラクタでしか変更できない

    private final Expression right;

    /**
     * コンストラクタ
     * 
     * @param Expression
     * @param Expression
     */
    protected BinaryOperatorExpression(Expression left, Expression right)
    {
        if(left == null || right == null){
            throw new NullPointerException();
        }

        this.left = left;
        this.right = right;
    }

    /**
     * 左数式を返却
     * 
     * @return Expression
     */
    protected Expression getLeft()
    {
        return this.left;
    }

    /**
     * 右数式を返却
     * 
     * @return Expression
     */
    protected Expression getRight()
    {
        return this.right;
    }

    /**
     * 数式を文字列に変換して返却
     * 
     * @return String
     */
    public String toString()
    {
        return String.format("(%s %s %s)", getLeft(), getOperator(), getRight());
    }

    /**
     * 抽象メソッドなので、継承先で実装必須
     * 
     * 加減乗除の記号を返却
     * 
     * @return Stirng
     */
    protected abstract String getOperator();
}