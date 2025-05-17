//Importar paquete java.util
import java.util.Scanner;

//Clase principal
public class SimuladorFarmacia{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitar datos al usuario
        System.out.println("Ingrese el nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.println("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();

        //Calcular el total
        double total = precioUnitario * cantidad;

        //Checar si aplica el descuento y calcularlo
        boolean AplicaDescuento = total > 500;
        double descuento = AplicaDescuento ? total * 0.15 : 0; //si "AplicaDescuento" es true hace (total*0.1) si es falso (0)

        //Final con o sin descuento (dependiendo si aplica)
        double costofinal = total - descuento;

        //Imprimir Información calculada
        System.out.println("\n Resumen de compra: ");
        System.out.println("Nombre del medicamento: " + medicamento);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total sin descuento: " + total);
        System.out.println("¿Aplica descuento? " + AplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio con descuento: " + costofinal);

        //cerrar el scanner
        scanner.close();
    }
}