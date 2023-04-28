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

    public static boolean checkReady (Vehicule vehicule) {
        if (vehicule.getMotor().getMotorName().equals("NoMotor")) {
            return false;
        } else if (vehicule.getNumberMaxWheel() != vehicule.getNumberWheelCurrent()) {
            return false;
            //}else if(vehicule.){
            //getNnPorteMax
        } else {
            return true;
        }
    }
}
