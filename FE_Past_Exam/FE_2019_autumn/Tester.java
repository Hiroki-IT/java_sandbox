/**
 * mainメソッド実行クラス
 */
public class Tester
{
    /**
     * mainメソッド
     * 
     * @param String[]
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException
    {
        // エラーが発生した場合、throwsステートメントの例外を投げる
        createUserMobileDevice("太郎", "スマホ");
        createUserMobileDevice("太郎", "タブレット");
        Notifier notifier = Notifier.getInstance();
        notifier.send("太郎", "メッセージがあります。");
        Thread.sleep(500L);
        notifier.shutdown();

        /* @ */
    }
    
    /**
     * 
     * @param String
     * @param String
     */
    private static void createUserMobileDevice(String user, String name)
    {
        MobileDevice device = new MobileDevice(
            name, messageList -> System.out.println(name + ":" + messageList) // ラムダ式での無名メソッド定義（引数->処理内容）
            );
        
        Notifier notifier = Notifier.getInstance();
        
        notifier.register(user, device);

        new Thread(()->{ //ラムダ式での無名メソッド定義（引数なし->処理内容）
            notifier.loopForMesseages(device);
                System.out.printf("システム終了：%sの%s%n", user, name);
            }).start();
    }
}