/**
 * 携帯端末クラス
 */
public final class MobileDevice // final classは継承不可
{
    
    private final String name; // finalプロパティは定数を表す

    private final NotificationListener listener;

    /**
     * 携帯端末コンストラクタ
     * 
     * @param name
     * @param listener
     */
    public MobileDevice(String name, NotificationListener listener) // NotificationListener実装クラスを引数に持つ
    {
        this.name = name;
        this.listener = listener;
    }

    /**
     * 
     * @return NotificationListener
     */
    public NotificationListener getListener()
    {
        return listener;
    }
    
    /**
     * 
     * @return String
     */
    public String getName()
    {
        return name;
    }
}