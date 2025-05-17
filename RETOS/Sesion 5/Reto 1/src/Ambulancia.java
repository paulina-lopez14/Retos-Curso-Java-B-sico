public class Ambulancia extends UnidadEmergencia {
    //Componentes de composición
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;


    public Ambulancia(String nombre, String nombreOperador){
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    //Método para invocar métodos
    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder(){
        System.out.println("🚑 Ambulancia en camino al hospital más cercano.");
    }

}
