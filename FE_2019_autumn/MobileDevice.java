// final classは、継承不可
public final class MobileDevice
{
    // finalプロパティは定数
    private final String name;

    private final NotificationListener listener;

    // コンストラクタ
    public MobileDevice(String name, NotificationListener listener)
    {
        this.name = name;
        this.listener = listener;
    }

    public NotificationListener getListener()
    {
        return listener;
    }

    public String getName()
    {
        return name;
    }
}