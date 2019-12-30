package com.example.test;

import com.example.expr.Addition;
import com.example.expr.Constant;
import com.example.expr.Expression;

/**
 * mainメソッド実行クラス
 * 
 */
public class Test
{
    /**
     * mainメソッド
     * 
     * @param String[]
     */
    public static void main(String[] args)
    {
        Expression two = new Constant(2);

        Expression five = new Constant(5);

        Expression add = new Addition(two,five);
        
        System.out.println(add + "=" + add.evaluate()); // addのtoStringは自動でコールされる
        
    }
}