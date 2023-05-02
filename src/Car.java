public class Car extends Vehicule {

    private int numberMaxDoor;
    private int numberDoorCurrent;


    public Car(final String name, final Motor motor, final Mark mark, final String color, final int nbRoueMax, final int nbRoueActuel, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity, int numberMaxDoor, int numberDoorCurrent, boolean ready, boolean custom) {
        super(name, motor, mark, color,nbRoueMax, nbRoueActuel, constructionYear, kmTravelled, remainingFuel, tankCapacity, ready, custom);
        this.numberMaxDoor = numberMaxDoor;
        this.numberDoorCurrent = numberDoorCurrent;
    }

    public int getNumberMaxDoor() {
        return numberMaxDoor;
    }

    public int getNumberDoorCurrent() {
        return numberDoorCurrent;
    }

    public boolean checkReady () {
        if (getMotor().getMotorName().equals("NoMotor")) {
            return false;
        } else if (getNumberMaxWheel() != getNumberWheelCurrent()) {
            return false;
        }else return getNumberMaxDoor() == getNumberDoorCurrent();
    }
}
