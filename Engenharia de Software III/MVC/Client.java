public class Client {
    private String nome;
    private String email;
    private boolean newProduct;
    private boolean newSale;

    public Client(String nome, String email, boolean newProduct, boolean newSale) {
        this.nome = nome;
        this.email = email;
        this.newProduct = newProduct;
        this.newSale = newSale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

    public boolean isNewSale() {
        return newSale;
    }

    public void setNewSale(boolean newSale) {
        this.newSale = newSale;
    }
}
