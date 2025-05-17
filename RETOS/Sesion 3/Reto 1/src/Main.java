
public class Main {
    public static void main(String[] args) {
        //Crear un pasajero y vuelo
        Pasajero pasajero = new Pasajero("Paulina López", "N10424846");
        Vuelo vuelo = new Vuelo("5783X", "Nueva York", "16:45");

        //Reservar un asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado){
            System.out.println(" Reserva realizada con éxito. \n");
        } else {
            System.out.println(" No se pudo realizar la reserva \n");
        }

        //Mandar a llamar el método para mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reserva
        System.out.println(" Cancelando reserva ... \n");
        vuelo.cancelarReserva();

        //Mostrar otra vez el itinerario;
        System.out.println(vuelo.obtenerItinerario());

        //Reservar un asiento ocupando un nombre y pasaporte
        vuelo.reservarAsiento("Laura Caramón", "N78493021");
        System.out.println(vuelo.obtenerItinerario());
    }
}