import java.util.List;

public class NewSaleListener implements EventListener {
    @Override
    public void sendMail(String data, String type, List<Client> clients) {
        for (Client client : clients) {
            if (client.isNewSale() && type.equals("sale")) {
                System.out.println("Sale Enviando email para " + client.getEmail() + ": Olá " + client.getNome() + ", " + data);
            }
        }
    }
}
