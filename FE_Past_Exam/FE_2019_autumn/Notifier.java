import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通知クラス
 */
public final class Notifier
{
    private static final Notifier Instance = new Notifier(); // 通知インスタンス定数

    private final Object lock = new Object(); // 鍵インスタンス
    
    private final Map<String, List<MobileDevice>> userMobileDevices = new HashMap<>(); // 要素のデータ型の指定

    private final Map<MobileDevice, List<String>> messagesToDeliver = new HashMap<>();

    private volatile boolean active = true;

    /**
     * 
     * @return Notifier
     */
    public static Notifier getInstance()
    {
        return Instance;
    }

    /**
     * 
     */
    private Notifier()
    {

    }

    /**
     * ユーザ登録メソッド
     * 
     * @param String
     * @param MobileDevice
     */
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

    /**
     * 通知メッセージ送信メソッド
     * 
     * @param String
     * @param String
     */
    public void send(String user, String messages)
    {
        List<MobileDevice> devices = new ArrayList<>(); // 要素のデータ型の指定

        synchronized(lock) {

            if(userMobileDevices.containsKey(user)) { // Map型でキー名の検索を行う。Booleanを返却

                for(MobileDevice device : userMobileDevices.get(user)) { // メソッドの返却値から要素を繰り返し抽出
                    List<String> messageList = messagesToDeliver.get(device);

                    if(messageList == null) {
                        messageList = new ArrayList<>();
                        messagesToDeliver.put(device, messageList);
                    }
                }
            }
        }

        for (MobileDevice device : devices) {
            synchronized (device) {
                device.notifyAll(); // Objectクラスのメソッドを使用
            }
        }

    }

    /**
     * 
     * @param MobileDevice
     */
    public void loopForMesseages(MobileDevice device)
    {
        while (active) { // TRUEの間だけ反復処理
            List<String> messageList;

            synchronized (lock) {
                messageList = messagesToDeliver.remove(device);
            }

            if (messageList != null) {
                device.getListener().onNotificationReceived(messageList);
            }

            synchronized (device) {
                try {
                    device.wait(3000L); // Objectクラスのメソッドを使用
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    /**
     * 
     */
    public void shutdown()
    {
        active = false;
        List<MobileDevice> devices = new ArrayList<>();

        synchronized(lock) {
            messagesToDeliver.clear();

            for(String user : userMobileDevices.keySet()) {
                for(MobileDevice device : userMobileDevices.get(user)) {
                    devices.add(device);
                }
            }

            userMobileDevices.clear();
        }

        for (MobileDevice device : devices) {
            synchronized (device) {
                device.notifyAll(); // Objectクラスのメソッドを使用
            }
        }
    }
}