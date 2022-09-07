package com.testes.logica.brasilprev.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseCaseTest {

    @Test
    void execute() {
        UseCase useCase = new UseCase();
        assertEquals("1", useCase.execute(1));
    }
}