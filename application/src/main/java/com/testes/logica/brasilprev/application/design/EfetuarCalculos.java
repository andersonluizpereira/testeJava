package com.testes.logica.brasilprev.application.design;

public class EfetuarCalculos {
    public String buscar(int numero) {
        return new CalcularPorTresECinco(
                new CalcularPorCinco(
                    new CalcularPorTres(
                            new SemCalculo(null)))).calcular(numero);
    }
}
