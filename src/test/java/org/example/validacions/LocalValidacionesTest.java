package org.example.validacions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalValidacionesTest {

    private LocalValidaciones localValidaciones;

    @BeforeEach
    public void setUp()
    {
        this.localValidaciones = new LocalValidaciones();
    }

    @Test
    public void validarNitCorrecto()
    {
        String nitCorrecto = "1234567890";
        Assertions.assertDoesNotThrow(() -> localValidaciones.validarNit(nitCorrecto));
    }
    @Test

    public void validarNitIncorrecto()
    {
    String nitIncorrecto = "absdkbalbalvbsdvlasdflasdfivbasdkvlbdfiab";
    Exception exception=Assertions.assertThrows(Exception.class, ()->LocalValidaciones.validarNit(nitIncorrecto));
    Assertions.assertEquals("señor usuario como minimo debe tener 10 caracteres",exception.getMessage());
    }

    @Test
    public void validarNombreCorrecto ()
    {
        String nombreCorrecto= "gñsooeheordfjgoiubo";
        Assertions.assertDoesNotThrow(()->localValidaciones.validarNombre(nombreCorrecto));
    }
    @Test
    public void validarNombreIncorrecto()
    {
        String nombreIncorrecto= "ilsdfuhsigsdlfghsdifughsdfjghsdfghsdifhgsdfhgsdfhgsdfihg";
        Exception exception=Assertions.assertThrows(Exception.class, ()-> localValidaciones.validarNombre(nombreIncorrecto));
        Assertions.assertEquals("señor usuario no pueder 30 los caracteres",exception.getMessage());
    }
}