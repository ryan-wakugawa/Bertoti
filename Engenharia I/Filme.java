public class Filme {
    String titulo;
    Especificacao espec;

    public Filme(String titulo, Especificacao espec) {
        this.titulo = titulo;
        this.espec = espec;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Especificacao getEspec() {
        return espec;
    }

    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
}
