package com.testes.logica.brasilprev.application.design;

public abstract class Calculo {
    protected Calculo proximo;

    public Calculo(Calculo proximo) {
        this.proximo = proximo;
    }
    public abstract String calcular(int numero);
}
