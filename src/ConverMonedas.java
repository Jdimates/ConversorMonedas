import com.google.gson.annotations.SerializedName;

import java.util.Scanner;

public class ConverMonedas {

    public static void convertir(String monedaBase,
                                 String monedaTarget,
                                 ValidarMoneda consulta,
                                 Scanner lectura
                                 )  {


        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.consultarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa para convertir hoy es\n1 "+monedaBase+ "="+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("ingrese la cantidad que deseada convertir en "+ monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = " +cantidadConvertida + " " + moneda.target_code());



    }
}

