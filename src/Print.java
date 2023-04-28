import java.util.List;

public class Print {
    public static void printVehicule (List<Vehicule> listvehicule){
        System.out.println("---------------------");
        for (int i = 0; i<listvehicule.size(); i++ ){
            System.out.println(i+1 + ") " + listvehicule.get(i).getMarque().getMarkName() + " " + listvehicule.get(i).getName());
        }
        System.out.println("---------------------");
    }

    public static void printCaracteristic (Vehicule Vehicule){

    }


}
