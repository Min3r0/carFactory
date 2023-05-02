public class Truck extends Vehicule{
    private int chargeMax;

    private int chargeActuel;
    private int nombreDeVitesse;
    public Truck(String name, Motor motor, Mark mark, String color, int numberMaxWheel, int numberWheelCurrent, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity,int chargeMax, int chargeActuel,int nombreDeVitesse, boolean ready, boolean custom) {
        super(name, motor, mark, color, numberMaxWheel, numberWheelCurrent, constructionYear, kmTravelled, remainingFuel, tankCapacity, ready, custom);
        this.chargeMax = chargeMax;
        this.chargeActuel = chargeActuel;
        this.nombreDeVitesse = nombreDeVitesse;
    }

    public int getChargeMax() {
        return chargeMax;
    }

    public int getChargeActuel() {
        return chargeActuel;
    }

    public int getNombreDeVitesse() {
        return nombreDeVitesse;
    }

    public boolean checkReady () {
        if (getMotor().getMotorName().equals("NoMotor")) {
            return false;
        } else if (getNumberMaxWheel() != getNumberWheelCurrent()) {
            return false;
        }else return getChargeMax() >= getChargeActuel();
    }
}
