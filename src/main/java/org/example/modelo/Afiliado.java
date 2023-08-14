package org.example.modelo;

import org.example.utilidades.MetodoPago;

public class Afiliado extends Usuario{


    private Integer valorMembresia;
    private MetodoPago metodospago;
    private String documenroReferido;
    private final Double Iva= 0.19;

    public Afiliado(){

    }


    @Override
    public Double caluclarAnualidad() {

        //cortoAnual y restar el 20% valor de la mensualidad
        Double calculo= this.getCostoAnual()-this.Iva*0.2;

        return calculo;
    }
}
