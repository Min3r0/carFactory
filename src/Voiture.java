public class Voiture {
    private Moteur moteur;
    private Marque marque;
    private int constructionYear;
    private int kmTravelled;
    private int remainingFuel;
    private int tankCapacity;
    private int nbDoor;
    private String color;

    public Voiture(Moteur moteur, Marque marque, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity, int nbDoor, String color){
        this.moteur = moteur;
        this.marque = marque;
        this.constructionYear = constructionYear;
        this.kmTravelled = kmTravelled;
        this.remainingFuel = remainingFuel;
        this.tankCapacity = tankCapacity;
        this.nbDoor = nbDoor;
        this.color = color;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public Marque getMarque() {
        return marque;
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

    public int getNbDoor() {
        return nbDoor;
    }

    public String getColor() {
        return color;
    }
}
