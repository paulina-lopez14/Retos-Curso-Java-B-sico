//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear dos facturas con mismo folio
        Factura factura1 = new Factura("L12345", "Paulina López", 12000);
        Factura factura2 = new Factura("L12345", "Arturo López", 15000 );

        // Mostrar info con toString
        System.out.println(factura1);
        System.out.println(factura2);

        //Compara si son iguales con equals
        System.out.println("¿Las facturas son iguales? " +factura1.equals(factura2));
    }
}