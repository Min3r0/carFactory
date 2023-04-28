import java.security.SecureRandom;
import java.sql.Struct;

public abstract class Vehicule {
    private String name;
    private Moteur moteur;
    private Marque marque;
    private String color;
    private int nbRoueMax;
    private int nbRoueActuel;
    private int constructionYear;
    private int kmTravelled;
    private int tankCapacity;
    private int remainingFuel;
    private boolean ready;
    private boolean custom;


    public Vehicule(final String name, final Moteur moteur, final Marque marque, final String color, final int nbRoueMax, final int nbRoueActuel, int constructionYear, int kmTravelled, int remainingFuel, int tankCapacity, boolean ready, boolean custom) {
        this.name = name;
        this.moteur = moteur;
        this.marque = marque;
        this.color = color;
        this.nbRoueMax = nbRoueMax;
        this.nbRoueActuel = nbRoueActuel;
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

    public Moteur getMoteur() {
        return moteur;
    }

    public Marque getMarque() {
        return marque;
    }


    public int getNbRoueActuel() {
        return nbRoueActuel;
    }

    public int getNbRoueMax() {
        return nbRoueMax;
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

}
