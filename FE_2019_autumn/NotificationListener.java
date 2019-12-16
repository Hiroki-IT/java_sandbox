import java.util.List;

public interface NotificationListener
{
    // public abstract は省略できる。
    void onNotificationReceived(List<String> messageList);
}