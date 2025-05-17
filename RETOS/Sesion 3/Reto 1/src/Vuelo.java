public class Vuelo {

    //Asignar atributos
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado; //Referencia al pasajero que reservó el asiento (puede ser null)

    //Métodos
    //Constructor Información del vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }
    // Reservar asiento
    public boolean reservarAsiento (Pasajero p){
        if(asientoReservado == null){
            asientoReservado = p;
            return true;
        }
        else {
            return false;
        }
    }
    // Reservar asiento con nombre y pasaporte Método sobrecargado
    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }
    //Cancelar reservación (método sin retorno)
    public void cancelarReserva(){
        asientoReservado = null;
    }
    //Método para mostrar itinerario
    public String obtenerItinerario(){
        String info = "🛩️ Itinerario de vuelo: \n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null){
            info += "Pasajero: "+ asientoReservado.nombre + "\n";
        } else{
            info += "Pasajero: [Sin reserva]\n";
        } return info;
    }

}
