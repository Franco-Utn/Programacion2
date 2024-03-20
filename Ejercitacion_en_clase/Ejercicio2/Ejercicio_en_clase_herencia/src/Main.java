public class Main {

    public static void main(String[] args) {

        // Creación de objetos

        Operario operario = new Operario("María García", 40);
        Oficial oficial = new Oficial("Pedro López", 35, 45);
        Tecnico tecnico = new Tecnico("Ana Fernández", 25, 12345678);
        Directivo directivo = new Directivo("Carlos Martínez", "Gerente");

        // Mostrar información de los objetos
        System.out.println(operario);
        System.out.println(oficial);
        System.out.println(tecnico);
        System.out.println(directivo);
        System.out.println("");
        // Llamada a métodos específicos
        System.out.println("Nombre completo del operario: " + operario.obtenerNombreCompleto());
        System.out.println("Edad del oficial: " + oficial.getEdad());
        System.out.println("DNI del técnico: " + tecnico.getDni());
        System.out.println("Rango del directivo: " + directivo.getRango());
    }

}
