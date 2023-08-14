package org.example.validacions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UsuarioValidacionesTest {
    //1.preparando
    //Probando el objeto UsuarioValidacion

    private UsuarioValidaciones usuarioValidacion;

    @BeforeEach
    public void configuracionInicial()
    {
        this.usuarioValidacion=new UsuarioValidaciones();

    }

    @Test
    public void validarNombreUsuarioCorrecto()
    {
        String nombreValido="Juan Esteban Muñoz";//Preparando
        //2 y 3 ejecutar y verificar
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validatrNombres(nombreValido));
    }


    @Test
    public void validarNombreUsuarioIncorrecto()
    {
        String nombreInvalido="123451 diego";
        String tamanoInvalido="diego";

        Exception exception=Assertions.assertThrows(Exception.class,()->usuarioValidacion.validatrNombres(nombreInvalido));
        Exception exception1=Assertions.assertThrows(Exception.class,()->usuarioValidacion.validatrNombres(tamanoInvalido));

        Assertions.assertEquals("señor usuario el nombr solo puede contener letras",exception.getMessage());
        Assertions.assertEquals("señor usuario el nombre debe tener minimo 10 letras",exception1.getMessage());
    }

    @Test
    void validarCorreoCorrecto()
    {
        String correoCorrecto = "klkjoijoi@gmail.com";
        Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarCorreo(correoCorrecto));
    }

    @Test
    void validarCorreoIncorrecto()
    {
        String correoIncorrecto = "sfsffd@com";
        Exception exception=assertThrows(Exception.class,() -> this.usuarioValidacion.validarCorreo(correoIncorrecto));
        Assertions.assertEquals("señor usuario correo invalido",exception.getMessage());
    }

    @Test
    void validarUbicacionCorrecta()
    {
        Integer ubicacionCorrecta = 2;
        Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarUbicacion(ubicacionCorrecta));
    }

    @Test
    void validarUbicacionIncorrecta()
    {
        Integer UbicacionIncorrecta=1223;
        Exception exception=assertThrows(Exception.class,() -> this.usuarioValidacion.validarUbicacion(UbicacionIncorrecta));
        Assertions.assertEquals("señor uniario la ubicacion es incorrecta",exception.getMessage());
    }
}