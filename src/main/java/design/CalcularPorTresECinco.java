package design;

public class CalcularPorTresECinco extends Calculo {

    public static final int TRES = 3;
    public static final int CINCO = 5;
    public static final int ZERO = 0;

    public CalcularPorTresECinco(Calculo proximo) {
        super(proximo);
    }

    @Override
    public String calcular(int numero) {
        if (numero % TRES == ZERO && numero % CINCO == 0) {
            return "FizzBuzz";
        }
        return proximo.calcular(numero);
    }
}
