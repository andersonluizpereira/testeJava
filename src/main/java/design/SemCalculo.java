package design;

public class SemCalculo extends Calculo {

    public SemCalculo(Calculo proximo) {
        super(null);
    }

    @Override
    public String calcular(int numero) {
        return "";
    }
}
