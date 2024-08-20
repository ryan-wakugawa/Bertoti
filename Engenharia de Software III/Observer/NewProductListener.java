package Observer;

import java.util.List;

public class NewProductListener implements EventListener {
    @Override
    public void sendMail(String data, String type, List<Client> clients) {
        for (Client client : clients) {
            if (client.isNewProduct() && type.equals("product")) {
                System.out.println("Product Enviando email para " + client.getEmail() + ": Olá " + client.getNome() + ", '" + data + "' agora está disponivel na loja!");
            }
        }
    }
}
