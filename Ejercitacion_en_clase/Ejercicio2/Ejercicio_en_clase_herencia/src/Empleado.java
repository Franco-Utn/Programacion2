public abstract class Empleado {
    private String nombre; //Paso 1 declara un atributo privado de tipo String llamado nombre en la clase actual.

    public Empleado(String nombre) { //Paso 2 Definimos constructor para la clase empleado. (que toma un argumento de tipo String y lo utiliza para establecer el valor del atributo nombre de la nueva instancia de la clase Empleado.)
        this.nombre = nombre;
    }

    //PAso 3 Definimos 2 métodos: getters & Setter
    public String getNombre() { //El método getNombre() devuelve el valor del atributo nombre
        return nombre;
    }

    public void setNombre(String nombre) { // método setNombre() establece el valor del atributo nombre.
        this.nombre = nombre;
    }

    @Override //@Override: Esta anotación indica que el método toString() está redefiniendo un método heredado de una clase padre
    public String toString() { //El método toString() redefinido en la clase Empleado devuelve una cadena que representa el estado del objeto.
        return "Empleado{" +
                "nombre='" + nombre + '\'' +'}';
        /*El cuerpo del método devuelve una cadena de texto que representa el estado actual del objeto Empleado. La cadena contiene:
            -La palabra clave Empleado.
            -El valor del atributo nombre entre comillas simples.
            -Los caracteres } para cerrar la cadena.*/
    }
}