package org.example.validacions;

import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfrtaVlidaciones {
    private Util util=new Util();

    public Boolean validarTitulo (String titulo) throws Exception{
        if (titulo.length()>20){
            throw new Exception("señor usuario no se puede pasar de 20 caracteres");
        }
            else {
                return true;
        }
    }
    public Boolean validarCosto(Double costo) throws Exception{
        if (costo<0){
            throw new Exception("señor usuario el costo no puede ser negativo");
        }
        else {
            return true;
        }
    }
    public Boolean validarFormatoFecha(String fechaInicio) throws Exception
    {
        String expresionRegular= "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})$";
        if (!util.buscarCoinsedencia(expresionRegular, fechaInicio))
        {
            throw new Exception("el formato debe de ser dd/mm/yyyy");
        }
        else
        {
            return true;
        }
    }


    public Boolean validarCoherencia(LocalDate fechaInicio,LocalDate fechaFin)throws Exception{
        if (fechaFin.isBefore(fechaInicio)){
            throw new Exception("la fecha de fin no puede ser manor a la fecha de inicio");

        }
        else {
            return true;
        }
    }
}
