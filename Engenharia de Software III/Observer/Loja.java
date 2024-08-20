package Observer;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private final List<EventListener> eventListeners = new ArrayList<>();
    private final List<String> products = new ArrayList<>();
    public final List<Client> clients = new ArrayList<>();

    public void addListener(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    public void addProduct(String product) {
        products.add(product);
        notifyClients(product, "product");
    }

    public void startSale() {
        notifyClients("Uma nova promoção começou!", "sale");
    }

    public void notifyClients(String data, String type) {
        for (EventListener eventListener : this.eventListeners) {
            eventListener.sendMail(data, type, clients);
        }
    }
}
