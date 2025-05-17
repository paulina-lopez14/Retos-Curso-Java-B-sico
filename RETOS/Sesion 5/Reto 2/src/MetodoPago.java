
// clase abstracta que implementa la interfaz Autenticable
public abstract class MetodoPago implements Autenticable {

    //Atributo protegido
    protected double monto;

    //Constructor
    public MetodoPago(double monto){
        this.monto = monto;
    }

    //Método abstracto procesar pago
    public abstract void procesarPago();

    //Método mostrar resumen
    public void mostrarResumen(){
        System.out.println("📃 Tipo: " +this.getClass().getSimpleName() + " - 💲 Monto: $" +monto);
    }
}