package com.testes.logica.brasilprev.application.design;

public class CalcularPorTres extends Calculo {

    public static final int TRES = 3;
    public static final int ZERO = 0;
    public static final String TEXTO = "Brasil";

    public CalcularPorTres(Calculo proximo) {
        super(proximo);
    }

    @Override
    public String calcular(int numero) {
        if (numero % TRES == ZERO) {
            return TEXTO;
        }
        return proximo.calcular(numero);
    }
}
