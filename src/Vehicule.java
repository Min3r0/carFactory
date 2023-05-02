public abstract class Vehicule {
    private final String name;
    private final Motor motor;
    private final Mark mark;
    private final String color;
    private final int numberMaxWheel;
    private final int numberWheelCurrent;
    private final int constructionYear;
    private final int kmTravelled;
    private final int tankCapacity;
    private int remainingFuel;
    private final boolean ready;
    private final boolean custom;

    public void addFuel(int fuelAdding){
        this.remainingFuel += fuelAdding;
    }

    public Vehicule(final String name, final Motor motor, final Mark mark, final String color, final int numberMaxWheel, final int numberWheelCurrent, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity, boolean ready, boolean custom) {
        this.name = name;
        this.motor = motor;
        this.mark = mark;
        this.color = color;
        this.numberMaxWheel = numberMaxWheel;
        this.numberWheelCurrent = numberWheelCurrent;
        this.constructionYear = constructionYear;
        this.kmTravelled = kmTravelled;
        this.remainingFuel = remainingFuel;
        this.tankCapacity = tankCapacity;
        this.ready = ready;
        this.custom = custom;
    }

    public String getName() {
        return name;
    }

    public Motor getMotor() {
        return motor;
    }

    public Mark getMark() {
        return mark;
    }


    public int getNumberWheelCurrent() {
        return numberWheelCurrent;
    }

    public int getNumberMaxWheel() {
        return numberMaxWheel;
    }

    public int setConstructionYear() {
        return constructionYear;
    }

    public int getKmTravelled() {
        return kmTravelled;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    abstract boolean checkReady();


}
