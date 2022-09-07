package application;

import org.junit.jupiter.api.Test;

public class VerificarCondicoesTest {

    @Test
    public void verificarCondicoesFizzBuzz() {
        VerificarCondicoes verificarCondicoes = new VerificarCondicoes();
        assert verificarCondicoes.verificarCondicoesFizzBuzz(1).equals("");
        assert verificarCondicoes.verificarCondicoesFizzBuzz(2).equals("");
        assert verificarCondicoes.verificarCondicoesFizzBuzz(3).equals("Fizz");
        assert verificarCondicoes.verificarCondicoesFizzBuzz(4).equals("");
        assert verificarCondicoes.verificarCondicoesFizzBuzz(5).equals("Buzz");
        assert verificarCondicoes.verificarCondicoesFizzBuzz(15).equals("FizzBuzz");
    }
}