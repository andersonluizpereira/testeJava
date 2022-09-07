package com.testes.logica.brasilprev.application.design;

public class CalcularPorTresECinco extends Calculo {

    public static final int TRES = 3;
    public static final int CINCO = 5;
    public static final int ZERO = 0;
    public static final String TEXTO = "PREVIDENCIA";

    public CalcularPorTresECinco(Calculo proximo) {
        super(proximo);
    }

    @Override
    public String calcular(int numero) {
        if (numero % TRES == ZERO && numero % CINCO == 0) {
            return TEXTO;
        }
        return proximo.calcular(numero);
    }
}
