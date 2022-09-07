package design;

public class CalcularPorTres extends Calculo {

    public static final int TRES = 3;
    public static final int ZERO = 0;

    public CalcularPorTres(Calculo proximo) {
        super(proximo);
    }

    @Override
    public String calcular(int numero) {
        if (numero % TRES == ZERO) {
            return "Fizz";
        }
        return proximo.calcular(numero);
    }
}
