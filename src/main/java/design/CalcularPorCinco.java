package design;

public class CalcularPorCinco extends Calculo {

    public static final int CINCO = 5;
    public static final int ZERO = 0;

    public CalcularPorCinco(Calculo proximo) {
        super(proximo);
    }

    @Override
    public String calcular(int numero) {
        if (numero % CINCO == ZERO) {
            return "Buzz";
        }
        return proximo.calcular(numero);
    }
}
