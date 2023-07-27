package org.example.validacions;

import org.example.utilidades.Util;

public class ReservaValidaciones {
  private Util util=new Util();

    public ReservaValidaciones() {
    }

    public Boolean validarPersonas(Integer personasPorReserva) throws Exception
    {
        if (personasPorReserva>4)
        {
            throw new Exception("señor usuario el numero de reservas no puede ser mas de 4");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarFormatoFecha(String fechaReserva) throws Exception
    {
        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})$";
        if (!util.buscarCoinsedencia(expresionRegular, fechaReserva))
        {
            throw new Exception("el formato de la fecha debe ser dd/mm/YYYY");
        } else
        {
            return true;
        }
    }
}

