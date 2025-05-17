import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        //Crear el objeto paciente con entrada de datos
        Scanner entrada = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        //Solicitud del nombre
        System.out.print(" Nombre del paciente: ");
        //asigna el nombre a paciente1
        paciente1.nombre = entrada.nextLine();

        //Solicitud de la edad
        System.out.print("Edad del paciente: ");
        //asigna la edad a paciente1
        paciente1.edad = entrada.nextInt();
        // nextInt no limpia el buffer, debemos poner nextLine para limpiarlo
        entrada.nextLine();

        //Solicitud del número de expediente
        System.out.println("Número de expediente: ");
        //Asigna el núm de expediente a paciente1
        paciente1.numexpediente = entrada.nextLine();

        //Cerrar el sncenner
        entrada.close();

        //Mandar a llamar la información que se ingresó
        paciente1.mostrarInformacion();
    }
}