import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

//Definir clase tema e implementar Comparable para ordenar por título
class Tema implements Comparable<Tema>{
    //Atributos
    String titulo;
    int prioridad;

    //Constructor
    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo); //Orden alfabético
    }

    @Override
    public String toString(){
        return "Tema: "+ titulo + " - Prioridad: "+ prioridad;
    }
}

public class PlaneacionEducativa {
    public static void main(String[] args) {
        //Crear una lista de temas concurrentes con CopyOnWriteArrayList
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matmáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        //Ordenar temas por prioridad con Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(a.prioridad, b.prioridad) {
                return 0;
            }
        }

        temas.sort(compare(a, b){
            return Integer.compare(a.prioridad, b.prioridad);
        });

        System.out.println("\n Temas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas){
            System.out.println(t);
        }
        //Crear un mapa concurrente de recursos con ConcurrenteHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del media ambiente", "https://recursos.edu/ambiente");

        //Mostrar el repositorio de recursos por tema
        System.out.println("\n Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()){
            System.out.println(tema + "->" + recursos.get(tema));
        }

    }
    }
