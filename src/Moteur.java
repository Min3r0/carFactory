public class Moteur {
    private int nbPiston;
    private double cylinderCapacity;
     private int couple;
     private int horsepower;

     private int consumption;

     public Moteur(int nbPiston, double cylinderCapacity, int couple, int horsepower, int consumption){
         this.nbPiston = nbPiston;
         this.cylinderCapacity = cylinderCapacity;
         this.couple = couple;
         this.horsepower = horsepower;
         this.consumption = consumption;
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
