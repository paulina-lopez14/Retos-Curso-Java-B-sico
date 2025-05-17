public class Operador {
    //Atributo
    String nombre;

    //Constructor
    public Operador(String nombre){
        this.nombre = nombre;
    }
    //Método para mostrar mensaje
    public void reportarse(){
        System.out.println("👨‍🦰 Operador " + nombre + " reportándose.");
    }
}
