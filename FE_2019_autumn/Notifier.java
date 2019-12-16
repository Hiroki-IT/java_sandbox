import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Notifier
{
    private static final Notifier Instance = new Notifier();

    private final Object lock = new Object();

    // 利用者ごとに携帯端末を管理
    private final Map<String, List<MobileDevice>> userMobileDevices = new HashMap<>();

    // 携帯端末ごとに通知メッセージを保持
    private final Map<MobileDevice, List<String>> messagesToDeliver = new HashMap<>();

    private volatile boolean active = true;

    public static Notifier getInstance()
    {
        return Instance;
    }

    private Notifier()
    {

    }

    public void register(String user, MobileDevice device)
    {
        synchronized(lock)
        {
            List<MobileDevice> devices = userMobileDevices.get(user);

            if(devices == null) {
                devices = new ArrayList<>();

                // Map型への値の格納
                userMobileDevices.put(user, devices);
            }

            // List型への値の格納
            devices.add(device);
        }
    }

    public void send(String user, String messages)
    {
        List<MobileDevice> devices = new ArrayList<>();

        synchronized(lock)
        {
            // Map型でキー名の検索を行う
            if(userMobileDevices.containsKey(users)) {
                for(MobileDevice device : userMobileDevices.get(user)) {
                    List<String> messageList = messagesToDeliver.get(device);
                }
            }
        }

    }



}