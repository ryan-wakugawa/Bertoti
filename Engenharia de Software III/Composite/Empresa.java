public class Empresa implements EmpresaComponent {
    private String nome;
    private double lucro;
    private double gastos;

    public Empresa(String nome, double lucro, double gastos) {
        this.nome = nome;
        this.lucro = lucro;
        this.gastos = gastos;
    }

    @Override
    public double calcularLucro() {
        return lucro;
    }

    @Override
    public double calcularGastos() {
        return gastos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}
