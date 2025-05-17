public abstract class UnidadEmergencia {
    // Atributo
    String nombre;

    //Constructor
    public UnidadEmergencia(String nombre){
        this.nombre = nombre;
    }

    //Método abstracto responder
    public abstract void responder();

    //Método conreto que imprima mensaje de activación
    public void activarUnidad(){
        System.out.println("⛑️Activando unidad: " + nombre);
    }
}
