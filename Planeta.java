public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean esObservable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, 
                   double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia al sol: " + distanciaAlSol);
        System.out.println("Es observable: " + esObservable);
    }

    public double calcularDensidad() {
        if (volumen == 0) {
            throw new IllegalStateException("El volumen no puede ser cero.");
        }
        return masa / volumen;
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta jupiter = new Planeta("Jupiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, true);

        System.out.println("Datos de la Tierra:");
        tierra.imprimirAtributos();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad());

        System.out.println("\nDatos de Júpiter:");
        jupiter.imprimirAtributos();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad());
    }
}