public class Auto extends Vehiculo {
    private Boolean convertible;

    public Auto() {}
    public Auto(Boolean convertible) {
        this.convertible = convertible;
    }

    public Auto(String owner, int doors, int wheels, Boolean convertible) {
        super(owner, doors, wheels);
        this.convertible = convertible;
    }

    public void open() {
        if (!convertible){
            System.out.println("El techo ya se encuentra abierto");
        }else{
            convertible = false;
            System.out.println("El techo se está abriendo");
        }
    }

    public void close() {
        if (convertible){
            System.out.println("El techo está cerrado");
        }
        else {
            convertible=false;
            System.out.println("El techo se está cerrando");
        }
    }


    @Override
    public void characteristics(){
        System.out.println("El dueño del auto es " + this.getOwner());
        System.out.println("Puertas: " + this.getDoors());
        System.out.println("Ruedas: " + this.getWheels());
        if(convertible){
            System.out.println("El auto es descapotable.");
        }

    }
}
