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
        String nombreInvalido="123451";
        Exception exception=Assertions.assertThrows(Exception.class,()->usuarioValidacion.validatrNombres(nombreInvalido));

    }
  
}