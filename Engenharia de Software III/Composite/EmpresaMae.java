import java.util.ArrayList;
import java.util.List;

public class EmpresaMae implements EmpresaComponent {
    private String nome;
    private List<EmpresaComponent> filiais;

    public EmpresaMae(String nome) {
        this.nome = nome;
        this.filiais = new ArrayList<>();
    }

    public void adicionarFilial(EmpresaComponent empresa) {
        filiais.add(empresa);
    }

    public void removerFilial(EmpresaComponent empresa) {
        filiais.remove(empresa);
    }

    @Override
    public double calcularLucro() {
        double lucroTotal = 0;
        for (EmpresaComponent filial : filiais) {
            lucroTotal += filial.calcularLucro();
        }
        return lucroTotal;
    }

    @Override
    public double calcularGastos() {
        double gastosTotais = 0;
        for (EmpresaComponent filial : filiais) {
            gastosTotais += filial.calcularGastos();
        }
        return gastosTotais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EmpresaComponent> getFiliais() {
        return filiais;
    }

    public void setFiliais(List<EmpresaComponent> filiais) {
        this.filiais = filiais;
    }
}
