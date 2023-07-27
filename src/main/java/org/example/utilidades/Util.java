package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public Boolean buscarCoinsedencia(String expresionRegular,String cadena){
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coinsidencia=patron.matcher(cadena);
        if (coinsidencia.matches()){
            return true;
        }
        else {
            return false;
        }
    }
}
