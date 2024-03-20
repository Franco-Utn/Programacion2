public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String genero, int edad, String raza) {
        super(nombre, genero, edad);
        this.raza = raza;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El perro ladra.");
    }

    public void informacion() {
        super.informacion();
        System.out.println("Raza: " + raza);
    }
}