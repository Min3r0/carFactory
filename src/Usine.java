import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Usine {

    public static List<Marque> initializeListMarques(){
        final List<Marque> listMarques = new ArrayList<>();
        listMarques.add( new Marque("Fiat", 1899, "Italia"));
        listMarques.add( new Marque("Ford",1903, "USA"));
        listMarques.add( new Marque("Peugeot",1896,"France"));

        return listMarques;
    }

    public static List<Moteur> initializeListMoteurs(){
        final List<Moteur> listMoteurs = new ArrayList<>();
        listMoteurs.add( new Moteur("Mmustang",8,4736,422,320, 12));
        listMoteurs.add( new Moteur("Mchiron",16,7993, 1600, 1600, 25));
        listMoteurs.add( new Moteur("M106",4,1124, 94, 60, 7));

        return listMoteurs;
    }

    public static List<Vehicule> initializeListVehicules(List<Marque> listMarques, List<Moteur> listMoteurs){
        final List<Vehicule> listVehicules = new ArrayList<>();
        listVehicules.add( new Voiture("Mustang69", listMoteurs.get(0), listMarques.get(1), 4, 4, 1969, 180, 48, 60, 3, "Yellow"));
        listVehicules.add( new Voiture("Peugeot106", listMoteurs.get(1), listMarques.get(2),4, 4, 2002,76000,15, 45,3,"Grey"));
        listVehicules.add( new Voiture("Miletipla", listMoteurs.get(2), listMarques.get(0),4, 4, 2023, 25, 12, 63,2,"Red"));

        return listVehicules;
    }

    public static void main(String[] args) {
        final List<Marque> listMarques = initializeListMarques();
        final List<Moteur> listMoteurs = initializeListMoteurs();
        final List<Vehicule> listVehicules = initializeListVehicules(listMarques, listMoteurs);


    }
}