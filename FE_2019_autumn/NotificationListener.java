import java.util.List;

/**
 * 通知受信インターフェース
 */
public interface NotificationListener
{
    /**
     * 通知受信メソッド
     * 
     * @param messageList
     */
    void onNotificationReceived(List<String> messageList); // public abstract は省略できる。
}