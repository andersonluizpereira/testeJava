package design;

public abstract class Calculo {
    protected Calculo proximo;

    public Calculo(Calculo proximo) {
        this.proximo = proximo;
    }
    public abstract String calcular(int numero);
}
