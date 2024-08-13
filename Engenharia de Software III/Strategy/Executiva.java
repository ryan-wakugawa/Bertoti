package Strategy;

public class Executiva implements Nivel {
    public double multiplicador = 1.25;

    public double calcular(double multiplicador, double distancia) {
        return multiplicador * distancia;
    }

    public double getMultiplicador() {
        return multiplicador;
    }
}
