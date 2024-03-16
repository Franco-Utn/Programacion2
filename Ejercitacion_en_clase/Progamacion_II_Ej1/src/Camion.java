// Clase Camion que extiende de Auto
public class Camion extends Auto {
    // Atributos adicionales específicos de Camion
    private int carga;

    // Constructor de Camion
    public Camion(String owner, int doors, int wheels, boolean convertible, int carga) {
        super(owner, doors, wheels, convertible);
        this.carga = carga;
    }

    // Método para obtener la carga del camión
    public int getCarga() {
        return carga;
    }

    // Método para cargar el camión
    public void carga() {
        System.out.println("Cargando el camión con " + carga + " kg");
    }

    // Método para imprimir características del camión
    @Override
    public void characteristics() {
        super.characteristics();
        System.out.println("Capacidad de carga: " + carga + " kg");
    }
}