public class Pajaro extends Animal {

    private String especie;
    private boolean cantor;

    public Pajaro(String nombre, String genero, int edad, String especie, boolean cantor) {
        super(nombre, genero, edad);
        this.especie = especie;
        this.cantor = cantor;
    }

    @Override
    public void hacer_sonido() {
        if (cantor) {
            System.out.println("El pájaro canta.");
        } else {
            System.out.println("El pájaro piar.");
        }
    }

    public void informacion() {
        super.informacion();
        System.out.println("Especie: " + especie);
        System.out.println("¿Es cantor?: " + cantor);
    }
}