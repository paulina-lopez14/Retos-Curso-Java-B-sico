import java.util.Objects;
public class Cuentafiscal {

    //Atributos
    private final String rfc;
    private double saldoDisponible;

    //Constructor con validación para que el saldo no sea negativo
    public Cuentafiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        if(saldoDisponible > 0){
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo 🙅🏻");
            this.saldoDisponible = 0;
        }
    }

    //Getters para ambos atributos
    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    //Método para comparar el RFC de la cuenta con el de la declaración
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    //Metodo para mostrar información de la cuenta
    public void mostrarCuenta(){
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }

}
