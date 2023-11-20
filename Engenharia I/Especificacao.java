import java.util.Collections;
import java.util.List;

public class Especificacao {
    int ano;
    String diretor;
    List<String> generos;

    public Especificacao(int ano, String diretor, List<String> generos) {
        this.ano = ano;
        this.diretor = diretor;
        this.generos = generos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public boolean comparar(Especificacao especificacao){
        return this.ano == especificacao.ano && this.diretor.equals(especificacao.diretor) && !Collections.disjoint(this.generos,especificacao.generos);
    }
}
