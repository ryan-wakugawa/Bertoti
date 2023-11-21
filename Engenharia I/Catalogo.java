import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Catalogo {
    List<Filme> filmes = new LinkedList<Filme>();

    public Catalogo(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public void cadastrarFilme(Filme filme){
        filmes.add(filme);
    }

    public List<Filme> buscarPorEspecificacao(Especificacao espec){
        List<Filme> filmesEncontrados = new LinkedList<Filme>();
        for (Filme filme:filmes){
            if (filme.getEspec().comparar(espec)){
                filmesEncontrados.add(filme);
            }
        }
        return filmesEncontrados;
    }

    public List<Filme> buscarPorTitulo(String pesquisa){
        List<Filme> filmesEncontrados = new LinkedList<Filme>();
        for (Filme filme:filmes){
            if (filme.getTitulo().toLowerCase().contains(pesquisa.toLowerCase())){
                filmesEncontrados.add(filme);
            }
        }
        return filmesEncontrados;
    }

    public List<Filme> buscarPorGenero(String pesquisa) {
        List<Filme> filmesEncontrados = new LinkedList<Filme>();
        for (Filme filme:filmes){
            if (filme.getEspec().getGeneros().contains(pesquisa)){
                filmesEncontrados.add(filme);
            }
        }
        return filmesEncontrados;
    }
}
