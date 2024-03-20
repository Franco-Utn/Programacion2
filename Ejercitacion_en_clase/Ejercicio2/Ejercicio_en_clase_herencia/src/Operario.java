public class Operario extends Empleado  {  //extends Empleado indica que la clase "Operario" hereda de la clase "Empleado".

    private int horasTrabajadas;
    public Operario (String nombre, int horasTrabajas){
        super(nombre); //Llama al constructor de la superclase "Empleado"
        this.horasTrabajadas = horasTrabajadas;
    }
    /*
    Resumen:

           - La subclase no hereda el constructor de la superclase.
           - La subclase debe definir su propio constructor para inicializar sus propios atributos.
           - El constructor de la subclase puede llamar al constructor de la superclase para inicializar los atributos de la superclase.
           - Si no se define un constructor en la subclase, el compilador genera un error.
     */
    public String obtenerNombreCompleto() {
        return "Operario: " + getNombre();
    }
    public int getHorasTrabajadas() { //Getter
        return horasTrabajadas;
    }

//Getters & Setters:
    /*
    En este ejemplo, la variable nombre es private en la clase Empleado.
    La clase Operario puede acceder a la variable nombre utilizando los métodos getNombre() y setNombre().
     */
    public void setHorasTrabajadas(int horasTrabajadas) { //Setter
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "Operario{"+
                "nombre='"+ getNombre()+ '\''+",horasTrabajadas="+ horasTrabajadas+'}';
    }
}
/*
Recuerda:

           - La clase "Operario" hereda todos los atributos y métodos de la clase "Empleado".
           - Puedes agregar nuevos atributos y métodos a la clase "Operario".
           - Puedes redefinir métodos heredados de la clase "Empleado" en la clase "Operario".
 */