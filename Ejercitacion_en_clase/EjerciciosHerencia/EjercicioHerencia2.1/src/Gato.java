public class Gato extends Animal {

    private String especie;

    public Gato(String nombre, String genero, int edad, String especie) {
        super(nombre, genero, edad);
        this.especie = especie;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El gato maúlla.");
    }

    public void informacion() {
        super.informacion();
        System.out.println("Especie: " + especie);
    }
}
