
public class CentralEmergencias {
    public static void main(String[] args) {
        //Crear tres objetos
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Pedro");
        Patrulla patrulla = new Patrulla("Patrulla", "José");
        UnidadBomberos bomberos = new UnidadBomberos("Bomberos", "Juan");

        //Mandar llamar método iniciarOperacion
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}