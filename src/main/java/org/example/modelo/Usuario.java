package org.example.modelo;

import org.example.validacions.UsuarioValidaciones;

public class Usuario {

    private Integer id;
    private String documento;
    private String nombre;
    private String correo;
    private Integer ubicacion;
    private UsuarioValidaciones validacion=new UsuarioValidaciones();

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombre, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try
        {
            this.validacion.validatrNombres(nombre);
            this.nombre=nombre;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try
        {
            this.validacion.validarCorreo(correo);
            this.correo=correo;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try
        {
            this.validacion.validarUbicacion(ubicacion);//Si las validaciones son ok
            this.ubicacion=ubicacion;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
