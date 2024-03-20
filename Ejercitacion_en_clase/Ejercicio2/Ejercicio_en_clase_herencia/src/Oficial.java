/**
 * Esta clase representa a un oficial.
 */
public class Oficial extends Operario {

    /**
     * La edad del oficial.
     */
    private int edad;

    /**
     * Constructor que crea un nuevo oficial.
     *
     * @param nombre         El nombre del oficial.
     * @param horasTrabajadas Las horas trabajadas por el oficial.
     * @param edad           La edad del oficial.
     */
    public Oficial(String nombre, int horasTrabajadas, int edad) {
        super(nombre, horasTrabajadas);
        this.edad = edad;
    }

    /**
     * Obtiene la edad del oficial.
     *
     * @return La edad del oficial.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del oficial.
     *
     * @param edad La nueva edad del oficial.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "edad=" + edad +
                '}';
    }
}
