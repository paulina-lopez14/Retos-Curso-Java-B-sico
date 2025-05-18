public class PaqueteNarrativo {
    //atributo
    private String escenaActual;

    //constructor
    public PaqueteNarrativo(String escenaActual){
        this.escenaActual = escenaActual;
    }
    public String getEscenaActual(){
        return escenaActual;
    }
    public void setEscenaActual(String nuevaEscena){
        this.escenaActual = nuevaEscena;
    }
}
