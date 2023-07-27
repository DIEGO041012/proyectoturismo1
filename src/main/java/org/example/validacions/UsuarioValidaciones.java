package org.example.validacions;

import org.example.utilidades.Util;

import java.util.regex.Pattern;

public class UsuarioValidaciones {

   protected Util util=new Util();

    public UsuarioValidaciones() {
    }

    public Boolean validatrNombres(String nombres) throws Exception{
        String expresionRegular= "^[a-zA-Z ñ]+$";
        if (!util.buscarCoinsedencia(expresionRegular,nombres)){
            throw new Exception("señor usuario el nombr solo puede contener letras");
        }
        else if (nombres.length()<10){
            throw new Exception("señor usuario el nombre debe tener minimo 10 letras");
        }
        else {
            return true;
        }
    }
    public Boolean validarCorreo(String correoElctronico) throws Exception
    {
        String expresionRegular="^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!util.buscarCoinsedencia(expresionRegular, correoElctronico))
        {
            throw new Exception("señor usuario correo invalido");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarUbicacion(Integer ubicacion) throws Exception
    {
        if (ubicacion.equals(1)||ubicacion.equals(2)||ubicacion.equals(3)||ubicacion.equals(4))
        {
            return true;
        }
        else
        {
            throw new Exception("señor uniario la ubicacion es incorrecta");
        }
    }
}
