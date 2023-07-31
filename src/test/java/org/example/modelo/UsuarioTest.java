package org.example.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void  configuracionInicial(){
        this.usuario=new Usuario();
    }
    @Test
    public void setcorrectoNombres(){
        String nombresValido ="diego londono vasquez";
        this.usuario.setNombre(nombresValido);//Ejecutar
        Assertions.assertEquals(nombresValido,usuario.getNombre());
        Assertions.assertNotNull(nombresValido, usuario.getNombre());
    }

    @Test

    public void setIncorrectoNombres(){
        String nombreInvalido="diegolo1234 vaquez";
        usuario.setNombre(nombreInvalido);
        Assertions.assertNotEquals(nombreInvalido,usuario.getNombre());
    }

}