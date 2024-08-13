package Strategy;

public class Economica implements Nivel{
    public double multiplicador = 0.8;

    public double calcular(double multiplicador, double distancia) {
        return multiplicador * distancia;
    }

    @Override
    public double getMultiplicador() {
        return multiplicador;
    }
}
