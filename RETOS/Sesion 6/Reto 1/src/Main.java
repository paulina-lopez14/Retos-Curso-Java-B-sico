
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList();
        //Añadir nombres de las especies
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens"); //muestra repetida

        System.out.println("🧪 Muestras recibidas en orden:");
        for(int i = 0; i < muestras.size(); i++){
            System.out.println((i+1) + ". " +muestras.get(i));
        }
        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\n Especies únicas proesadas: ");
        for(String especie : especiesUnicas){
            System.out.println("- " + especie);
        }
        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();
        //Añadir asociaciones ID con investivador
        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dra. Pérez");
        muestrasInvestigador.put("M-003", "Dra. García");

        System.out.println("\n Asignación demuestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()){
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }
        // Paso 4: Mostrar resultados
        String idBuscar = "M-002";
        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}