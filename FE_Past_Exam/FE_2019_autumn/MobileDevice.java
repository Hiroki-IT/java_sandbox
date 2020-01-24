package FE_2019_autumn;

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
     * @param name     the name
     * @param listener the listener
     */
    public MobileDevice(String name, NotificationListener listener) // NotificationListener実装クラスを引数に持つ
    {
        this.name = name;
        this.listener = listener;
    }

    /**
     * Gets listener.
     *
     * @return NotificationListener listener
     */
    public NotificationListener getListener()
    {
        return listener;
    }

    /**
     * Gets name.
     *
     * @return String name
     */
    public String getName()
    {
        return name;
    }
}