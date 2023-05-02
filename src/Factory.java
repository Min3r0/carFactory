import java.util.ArrayList;
import java.util.List;

public class Factory {

    public static List<Mark> initializeListMark(){
        final List<Mark> markList = new ArrayList<>();
        markList.add( new Mark("Fiat", 1899, "Italia"));
        markList.add( new Mark("Ford",1903, "USA"));
        markList.add( new Mark("Peugeot",1896,"France"));

        return markList;
    }

    public static List<Motor> initializeListMotor(){
        final List<Motor> motorList = new ArrayList<>();
        motorList.add( new Motor("noMotor",0,0,0,0,0));
        motorList.add( new Motor("Mmustang",8,4736,422,320, 12));
        motorList.add( new Motor("Mchiron",16,7993, 1600, 1600, 25));
        motorList.add( new Motor("M106",4,1124, 94, 60, 7));
        motorList.add(new Motor("SERIE PERFORMANCE X15 (2021)",6,6472,2779,500,23));
        return motorList;
    }

    public static List<Vehicule> initializeListVehicules(List<Mark> listMarques, List<Motor> listMotors){
        final List<Vehicule> vehiculeList = new ArrayList<>();
        vehiculeList.add( new Car("Mustang69", listMotors.get(1), listMarques.get(1), "Yellow",4, 4, 1969, 180, 48, 60, 3, 3, true, false));
        vehiculeList.add( new Car("Peugeot106", listMotors.get(2), listMarques.get(2),"Grey",4, 4, 2002,76000,15, 45,3,3, true, false));
        vehiculeList.add( new Car("Milletipla", listMotors.get(3), listMarques.get(0),"Red",4, 4, 2023, 25, 12, 63,2,2, true, true));
        vehiculeList.add(new Truck("Camtar",listMotors.get(4),listMarques.get(1),"Blue",6,6,2021,60000,150,550,38000,8000,12,true,false));
        return vehiculeList;
    }

    public static boolean checkReady (Vehicule vehicule){
        return vehicule.checkReady();
    }


    public static void main(String[] args) {
        final List<Mark> listMark = initializeListMark();
        final List<Motor> listMotors = initializeListMotor();
        final List<Vehicule> listVehicules = initializeListVehicules(listMark, listMotors);

        Print.printVehicule(listVehicules);
        Menu.mainMenu(listVehicules);


    }
}