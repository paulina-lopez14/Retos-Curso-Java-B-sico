 import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
public class RegistroSimulacion {
    public static void main(String[] args) {
        //Definir la ruta del archivo
        Path rutaCarpeta = Paths.get("src/Solucion_Reto_01/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        //Crear un String con los parámetros de simulación
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        try{
            //Crear la carpeta si no existe
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println(" Carpeta 'config' creada.");
            }
            //Escribir el contenido en el archivo
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            //Validar si el archivo fue creado
            if(Files.exists(rutaArchivo)){
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());
                //Leer el contenido y mostrarlo
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archiv: ");
                System.out.println(contenidoLeido);
            } else {
                System.out.println(" El archivo no fue creado.");
            }
        } catch (IOException e){
            System.out.println("Error al trabajar con el archivo: "+ e.getMessage());
        }
    }
}