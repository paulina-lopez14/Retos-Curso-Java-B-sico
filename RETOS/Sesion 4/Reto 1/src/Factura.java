public class Factura {

    //Atributos
    String folio;
    String cliente;
    double total;

    // Constructor para inicializar los atributos
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString para mostrar la info
    @Override
    public String toString(){
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    //Método equals para que dos facturas se consideren iguales si tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Comparamos solo el folio
    }

    //Método hashCode basado en el atributo folio
    @Override
    public int hashCode() {

        return folio.hashCode();
    }
}
