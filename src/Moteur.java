public class Moteur {
    private String name;
    private int nbPiston;
    private double cylinderCapacity;
     private int couple;
     private int horsepower;
     private int consumption;

     public Moteur(String name,int nbPiston, double cylinderCapacity, int couple, int horsepower, int consumption){

         this.name = name;
         this.nbPiston = nbPiston;
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

    public int getNbPiston() {
        return nbPiston;
    }

    public int getConsumption() {
        return consumption;
    }
}
