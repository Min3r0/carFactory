public class Motor {
    private String name;
    private int numberPiston;
    private double cylinderCapacity;
     private int couple;
     private int horsepower;
     private int consumption;

     public Motor(String name, int numberPiston, double cylinderCapacity, int couple, int horsepower, int consumption){

         this.name = name;
         this.numberPiston = numberPiston;
         this.cylinderCapacity = cylinderCapacity;
         this.couple = couple;
         this.horsepower = horsepower;
         this.consumption = consumption;
     }

    public String getMotorName() {
        return name;
    }

    public int getCouple() {
        return couple;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getNumberPiston() {
        return numberPiston;
    }

    public int getConsumption() {
        return consumption;
    }
}
