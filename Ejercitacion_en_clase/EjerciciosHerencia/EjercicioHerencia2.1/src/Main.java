public class Main {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Toby", "Macho", 5, "Labrador Retriever");
        perro1.hacer_sonido(); // Imprime "El perro ladra."
        perro1.informacion();

        Gato gato1 = new Gato("Luna", "Hembra", 3, "Siamés");
        gato1.hacer_sonido(); // Imprime "El gato maúlla."
        gato1.informacion();

        Pajaro pajaro1 = new Pajaro ("Piolin", "Macho", 2, "Canario", true);
        pajaro1.hacer_sonido(); // Imprime "El pájaro canta."
        pajaro1.informacion();
    }
}
