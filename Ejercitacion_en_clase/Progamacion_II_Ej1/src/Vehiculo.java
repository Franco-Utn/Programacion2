public abstract class Vehiculo {
    private String owner;
    private int doors;
    private int wheels;

    public Vehiculo() {

    }

    public Vehiculo(String owner, int doors, int wheels) {
        this.owner = owner;
        this.doors = doors;
        this.wheels = wheels;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }



    public abstract void characteristics();
}
