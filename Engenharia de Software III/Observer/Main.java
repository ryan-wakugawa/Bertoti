package Observer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.addListener(new NewSaleListener());
        loja.addListener(new NewProductListener());

        loja.clients.addAll(
                Arrays.asList(
                        new Client("Carlos", "carlos@gmail.com", true, true),
                        new Client("Maria", "maria@gmail.com", false, true),
                        new Client("Roberto", "roberto@gmail.com", true, false)
                )
        );

        loja.addProduct("Sapato");
        loja.startSale();
    }
}
