public class Entrada {

    //Atributos
    String nombreevento;
    double precio;

    //Constructor
    public Entrada(String nombreevento, double precio) {
        this.nombreevento = nombreevento;
        this.precio = precio;
    }

    // Método mostrarInformación()
    public void mostrarInformacion(){
        System.out.println("Evento: " +nombreevento+ "- Precio: $" + precio);
    }

}
