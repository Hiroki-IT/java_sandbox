package com.example.expr;

import com.example.expr.Expression;

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
     * @param Expression
     * @param Expression
     */
    public Substraction(Expression left, Expression right)
    {
        super(left, right);
    }

    /**
     * 減法の結果を返却
     * 
     * @return int
     */
    public int evaluate()
    {
        return this.getLeft - this.getRight;
    }

    /**
     * 減法の記号を返却
     * 
     * @return Stirng
     */
    protected String getOperator()
    {
        return "-";
    }
}