package Strategy;

public class Passagem {
    private Nivel nivel;
    private double distancia;

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    private void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double calcularPassagem() {
        return nivel.calcular(distancia, nivel.getMultiplicador());
    }
}
