public class Voiture extends Vehicule {

    private int nbPorteMax;
    private int nbPorteActuel;


    public Voiture(final String name, final Moteur moteur, final Marque marque, final String color, final int nbRoueMax, final int nbRoueActuel, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity, int nbPorteMax, int nbPorteActuel, boolean ready, boolean custom) {
        super(name, moteur, marque, color,nbRoueMax, nbRoueActuel, constructionYear, kmTravelled, remainingFuel, tankCapacity, ready, custom);
        this.nbPorteMax = nbPorteMax;
        this.nbPorteActuel = nbPorteActuel;
    }

    public int getNbPorteMax() {
        return nbPorteMax;
    }

    public int getNbPorteActuel() {
        return nbPorteActuel;
    }
}
