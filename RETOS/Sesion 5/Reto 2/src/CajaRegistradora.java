
public class CajaRegistradora {
    public static void main(String[] args) {
        //creando instancias de cada clase
        MetodoPago[] pagos = {
                new PagoEfectivo(150),
                new PagoTarjeta(320, 1000),
                new PagoTransferencia(300, false) //mostrará un error al pagar
        };

        for(MetodoPago pago : pagos){
            if(pago.autenticar()){
                System.out.println("✅Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            }else {
                System.out.println(" Fallo de autenticación." + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}