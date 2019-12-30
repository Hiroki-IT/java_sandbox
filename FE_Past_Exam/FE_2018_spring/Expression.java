package com.example.expr; // namespace宣言に相当

/**
 * ライブラリ
 * 
 * 数式インターフェース
 */
public interface Expression
{
    /**
     * 算出メソッド
     * 
     * @return int
     */
    public int evaluate();
}