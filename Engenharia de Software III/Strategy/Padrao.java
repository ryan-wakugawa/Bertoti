package Strategy;

public class Padrao implements Nivel {
    public double multiplicador = 1;

    public double calcular(double multiplicador, double distancia) {
        return multiplicador * distancia;
    }

    @Override
    public double getMultiplicador() {
        return multiplicador;
    }
}
