package FE_2018_spring;

/**
 * mainメソッド実行クラス
 */
public class Test
{
    /**
     * mainメソッド
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Expression two = new Constant(2);

        Expression five = new Constant(5);

        Expression add = new Addition(two, five);

        System.out.println(add + "=" + add.evaluate()); // addのtoStringは自動でコールされる

    }
}