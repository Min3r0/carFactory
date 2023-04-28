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
        listMoteurs.add( new Moteur("noMotor",0,0,0,0,0));
        listMoteurs.add( new Moteur("Mmustang",8,4736,422,320, 12));
        listMoteurs.add( new Moteur("Mchiron",16,7993, 1600, 1600, 25));
        listMoteurs.add( new Moteur("M106",4,1124, 94, 60, 7));

        return listMoteurs;
    }

    public static List<Vehicule> initializeListVehicules(List<Marque> listMarques, List<Moteur> listMoteurs){
        final List<Vehicule> listVehicules = new ArrayList<>();
        listVehicules.add( new Voiture("Mustang69", listMoteurs.get(0), listMarques.get(1), "Yellow",4, 4, 1969, 180, 48, 60, 3, 3, true, false));
        listVehicules.add( new Voiture("Peugeot106", listMoteurs.get(1), listMarques.get(2),"Grey",4, 4, 2002,76000,15, 45,3,3, true, false));
        listVehicules.add( new Voiture("Miletipla", listMoteurs.get(2), listMarques.get(0),"Red",4, 4, 2023, 25, 12, 63,2,2, true, true));

        return listVehicules;
    }

    public static boolean checkReady (Vehicule vehicule){
        if (vehicule.getMoteur().getMotorName().equals("NoMotor")){
            return false;
        }else if(vehicule.getNbRoueMax()!= vehicule.getNbRoueActuel()){
            return false;
        }else if(vehicule.){
            //getNnPorteMax
        }else{
            return true;
        }
    }



    public static void main(String[] args) {
        final List<Marque> listMarques = initializeListMarques();
        final List<Moteur> listMoteurs = initializeListMoteurs();
        final List<Vehicule> listVehicules = initializeListVehicules(listMarques, listMoteurs);



    }
}