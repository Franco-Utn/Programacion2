public class Tecnico extends Operario{


    private int dni;

    public Tecnico(String nombre, int horasTrabajadas,int dni) {
        super(nombre, horasTrabajadas);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "dni=" + dni +
                '}';
    }
}
