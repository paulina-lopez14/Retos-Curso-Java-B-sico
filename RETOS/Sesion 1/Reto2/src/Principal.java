public class Principal{
    public static void main (String[] args){
        // Primer objeto tipo entrada
        Entrada entrada1 = new Entrada("Obra de teatro", 100);

        //Segundo objeto tipo entrada
        Entrada entrada2 = new Entrada("Festival", 150);

        //Llamar al método para mostrar la información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}