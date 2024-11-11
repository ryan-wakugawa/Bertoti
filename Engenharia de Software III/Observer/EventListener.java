import java.util.List;

public interface EventListener {
    void sendMail(String data, String type, List<Client> clients);
}
