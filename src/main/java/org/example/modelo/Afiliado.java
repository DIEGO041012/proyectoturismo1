package org.example.modelo;

public class Afiliado extends Usuario{


    private Integer valorMembresia;
    private Metodopago metodospago;
    private String documenroReferido;
    private final Double Iva= 0.19;

    public Afiliado(){

    }


    @Override
    public Double caluclarAnualidad() {

        //cortoAnual y restar el 20% valor de la mensualidad
        Double calculo= this.getCostoAnual()-this.*0.2;

    }
}
