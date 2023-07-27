package org.example.modelo;

import org.example.validacions.ReservaValidaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer personasPorReserva;
    private ReservaValidaciones validacion=new ReservaValidaciones();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try
        {
            this.validacion.validarFormatoFecha(fechaReserva);
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha= LocalDate.parse(fechaReserva, formatter);
            this.fechaReserva= fecha;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getPersonasPorReserva() {
        return personasPorReserva;
    }

    public void setPersonasPorReserva(Integer personasPorReserva) {
        try
        {
            this.validacion.validarPersonas(personasPorReserva);
            this.personasPorReserva=personasPorReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
