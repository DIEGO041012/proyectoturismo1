package org.example.validacions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfrtaVlidacionesTest {

    private OfrtaVlidaciones ofrtaVlidaciones;

    @BeforeEach

    public void SetUp()
    {
        this.ofrtaVlidaciones=new OfrtaVlidaciones();
    }

    @Test

    public void ValidarTitulo()
    {
        String tituloValido= "las-validaciones";
        Assertions.assertDoesNotThrow(()->ofrtaVlidaciones.validarTitulo("ValidarTitulo"));
    }

    @Test
    public void validarTituloIncorrecto()
    {
        String tituloInvalido= "djgslgsñsnsebneounshjgjkfyufugfuhgigiugpiuhpiuhpiudfbnodsjhgsssjnsbn";
        Exception exception =Assertions.assertThrows(Exception.class,() -> ofrtaVlidaciones.validarTitulo(tituloInvalido));
        Assertions.assertEquals("señor usuario no se puede pasar de 20 caracteres",exception.getMessage());
    }
}


