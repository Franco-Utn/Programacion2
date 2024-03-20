public class Animal {
    private String nombre;
    private String genero;
    private int edad;

    public Animal(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
    public void hacer_sonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    protected void informacion() {
    }
}
