public class Directivo extends Empleado {
    private String rango;
    public Directivo(String nombre,String rango) {
        super(nombre);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "rango='" + rango + '\'' +
                '}';
    }
}
