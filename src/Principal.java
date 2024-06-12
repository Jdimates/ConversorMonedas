import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ValidarMoneda consulta = new ValidarMoneda();

        int opcion=0;
        while (opcion != 7){

            System.out.println(
                    "*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n" +
                    "le damos la bienvenida al conversor de monedas\n\n" +
                    "1) Dolar =>> peso Argentino\n"+
                    "2) Peso Argentino =>> Dolar\n"+
                    "3) Dolar =>> real Brasileño\n"+
                    "4) Real Brasileño =>> Dolar\n"+
                    "5) Dolar =>> peso Colombiano\n"+
                    "6) Peso colombiano =>> Dolar\n"+
                    "7) Salir\n"+
                    "Elija una Opcion Valida:\n"+
                     "/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConverMonedas.convertir("USD", "ARS", consulta, lectura);
                    break;

                case 2:
                    ConverMonedas.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConverMonedas.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConverMonedas.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConverMonedas.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConverMonedas.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("saliendo.......");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;

            }


        }
    }
}





