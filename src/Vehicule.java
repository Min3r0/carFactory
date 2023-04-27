public abstract class Vehicule {
    private String name;
    private Moteur moteur;
    private Marque marque;
    private int nbRoueMax;
    private int nbRoueActuel;
    private int constructionYear;
    private int kmTravelled;
    private boolean ready;
    private boolean custom;


    public Vehicule(final String name, final Moteur moteur, final Marque marque, final int nbRoueMax, final int nbRoueActuel, int constructionYear, int kmTravelled) {
        this.name = name;
        this.moteur = moteur;
        this.marque = marque;
        this.nbRoueMax = nbRoueMax;
        this.nbRoueActuel = nbRoueActuel;
    }

    public String getName() {
        return name;
    }

    public Marque getMarque() {
        return marque;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public int getNbRoueActuel() {
        return nbRoueActuel;
    }

    public int getNbRoueMax() {
        return nbRoueMax;
    }
}
