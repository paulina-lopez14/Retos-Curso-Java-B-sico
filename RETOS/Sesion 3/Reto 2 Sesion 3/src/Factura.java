public class Factura {
    //Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //Constructor: convierte el RFC en Optional, puede ser null
    public factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //Método público que devuelve un resumen de la factura
    public String getResumen(){
        String resumen = "Factura generada: \n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";
    }

    // Si el RFC está presente, se muestra. Si no, se muestra mensaje alternativo
    resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
    return resumen;
}
