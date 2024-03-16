public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Auto (coche)
        Auto car = new Auto("Franco", 4, 4, true);
        // Crear una instancia de la clase Camion
        Camion truck = new Camion("Franco", 2, 6, true, 800);

        // Llamar a los métodos de la clase Auto (coche)
        car.open();
        car.close();
        car.characteristics();

        // Llamar a los métodos de la clase Camion
        truck.open();
        truck.close();
        truck.characteristics();
        truck.carga();
    }
}