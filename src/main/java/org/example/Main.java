package org.example;

import org.example.modelo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
      Usuario usuario= new Usuario();
        Oferta oferta= new Oferta();
        Local local = new Local();
        Reserva reserva= new Reserva();
        Afiliado afiliado=new Afiliado();

        System.out.print("Señor usuario ingresa tus nombres y apellidos: ");
        usuario.setNombre(teclado.nextLine());
        System.out.print("Señor usuario ingrese el documento: ");
        usuario.setDocumento(teclado.nextLine());
        System.out.print("Ingresa tu correo electronico: ");
        usuario.setCorreo(teclado.nextLine());
        System.out.print("Señor usuario ingrese el numero de la zona (1/2/3/4): ");
        usuario.setUbicacion(teclado.nextInt());

        System.out.print("señor usuario ingrese el nombre de su local: ");
        local.setNombre(teclado.nextLine());
        System.out.print("señor usuario ingrese el nit del local: ");
        local.setNit(teclado.nextLine());

        System.out.print("señor usuario ingrese el titulo de la oferta: ");
        oferta.setTitulo(teclado.nextLine());
        System.out.print("señor usuario ingrese la fecha de inicio:  ");
        oferta.setFechaInicio(teclado.nextLine());
        System.out.print("señor usuario ingrese la fecha de fin: ");
        oferta.setFechaFin(teclado.nextLine());
        System.out.print("señor usuario ingrese Costo por persona: ");
        oferta.setCostoPersona(teclado.nextDouble());

        System.out.print("Fecha de la reserva: ");
        reserva.setFechaReserva(teclado.nextLine());
        System.out.print("Cantidad de personas para la reserva: ");
        reserva.setPersonasPorReserva(teclado.nextInt());


    }
}