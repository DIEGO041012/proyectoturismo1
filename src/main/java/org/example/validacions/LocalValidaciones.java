package org.example.validacions;

public class LocalValidaciones {

    public static Boolean validarNit(String nit) throws Exception
    {
        if (nit.length()==10){
          return true;
        }
        else
    {
        throw new Exception("señor usuario como minimo debe tener 10 caracteres");

    }

    }
    public Boolean validarNombre(String nombre) throws Exception{
        if (nombre.length()>30){

            throw new Exception("señor usuario no pueder 30 los caracteres");
        }
        else {
            return true;
        }

    }

}
