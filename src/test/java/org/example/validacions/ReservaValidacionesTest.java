package org.example.validacions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionesTest {

    private ReservaValidaciones reservaValidacioness;

    @BeforeEach

    public void SetUp()
    {
        this.reservaValidacioness=new ReservaValidaciones();
    }

    @Test

    public void formatoFechaValido()
    {
     String formatoFechaValida= "14/08/2023";
        Assertions.assertDoesNotThrow(()->reservaValidacioness.validarFormatoFecha(formatoFechaValida));
    }

    @Test

    public void formatoFechaInvalida()
    {
        String formatoFechaInvalida= "2023/10/10";
        Exception exception = Assertions.assertThrows(Exception.class,()->reservaValidacioness.validarFormatoFecha(formatoFechaInvalida));
        Assertions.assertEquals("el formato de la fecha debe ser dd/mm/YYYY",exception.getMessage());
    }

    @Test
    void validarPersonaCorrecto()
    {
        Integer validarPersona=2;
        Assertions.assertDoesNotThrow(() -> this.reservaValidacioness.validarPersonas(validarPersona));
    }

    @Test
    void validarPersonaIncorrecta()
    {
        Integer validarPersonaIncorrecta=29;
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.reservaValidacioness.validarPersonas(validarPersonaIncorrecta));
        Assertions.assertEquals("señor usuario el numero de reservas no puede ser mas de 4",exception.getMessage());
    }
}