
public class Main {
    public static void main(String[] args) {

        // Crea una declaración de impuestos y cuenta fiscal
        DeclaracionImpuestos declaracion1 = new DeclaracionImpuestos("ROSP14092003SDCI", 30000);
        Cuentafiscal cuenta1 = new Cuentafiscal("ROSP14092003SDCI", 50000);

        //Muestra la información de ambas
        System.out.println("😊 Declaración enviada por RFC: "+ declaracion1.rfcContribuyente() + " por $" +declaracion1.montoDeclarado());
        cuenta1.mostrarCuenta();

        //Valida si el RFC coincide y muestra el resultado
        boolean RFCvalido = cuenta1.validarRFC(declaracion1);
        System.out.println("✅¿RFC válido para esta cuenta? "+ RFCvalido);

    }
}