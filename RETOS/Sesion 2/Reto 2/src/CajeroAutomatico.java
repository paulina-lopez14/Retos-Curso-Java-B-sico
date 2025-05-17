import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Definiendo saldo inicial
        var saldoinicial = 1000;
        // do-while
        int accion;

        do{
            //Menú interactivo
            System.out.println(" \n Bienvenido al cajero automático 😁");
            System.out.println(" 1. Consultar saldo");
            System.out.println(" 2. Depositar dinero");
            System.out.println(" 3. Retirar dinero");
            System.out.println(" 4. Salir");
            System.out.println("Por favor, ingrese la acción que desea realizar: ");
            accion = scanner.nextInt(); //Leer la opción que ingrese el cliente

            switch (accion) {
            case 1 -> //Mostrar el saldo actual
                    System.out.println(" \n Saldo actual: $"+saldoinicial);
            case 2 -> {
                //Pedir monto a depositar y sumarlo al saldo
                System.out.println("\n Monto a depositar: ");
                int deposito = scanner.nextInt();
                int nuevosaldo = saldoinicial + deposito;
                System.out.println("Nuevo saldo: "+ nuevosaldo);
            }
            case 3 -> {
                //Pedir monto a retirar
                System.out.println("\n Monto a retirar: ");
                double retiro = scanner.nextInt();
                //Validar si hay saldo suficiente y dar nuevo saldo o imprimir que no hay saldo suficiente
                if(retiro < saldoinicial){
                     double nuevosaldo = saldoinicial - retiro;
                     System.out.println("Nuevo saldo: $"+ nuevosaldo);
                }
                else {
                    System.out.println("No cuenta con saldo suficiente. Su saldo es de $"+ saldoinicial);
                    continue;
                }
            }

            case 4 -> //Mostrar mensaje de despedida
                    System.out.println("\n Gracias por usar el cajero😊 ¡Hasta pronto!");

            default -> {
                //Opción no válida
                    System.out.println("\n Opción no válida, intente nuevamente");
                }

            }
        } while(accion != 4); //Ocupamos el operador realcional != (distinto de)

        scanner.close(); //Cerrar el scanner
    }
}