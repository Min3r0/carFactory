public class Voiture extends Vehicule {


    private int remainingFuel;
    private int tankCapacity;
    private int nbPorteMax;
    private int nbPorteActuel;



    private String color;

    public Voiture(String name, Moteur moteur, Marque marque, int nbRoueMax, int nbRoueActuel, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity, int nbPorteMax, String color){
        super(name, moteur, marque, nbRoueMax, nbRoueActuel, constructionYear, kmTravelled);
        this.remainingFuel = remainingFuel;
        this.tankCapacity = tankCapacity;
        this.nbPorteMax = nbPorteMax;
        this.color = color;
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

    public int getNbPorteMax() {
        return nbPorteMax;
    }

    public String getColor() {
        return color;
    }
}
