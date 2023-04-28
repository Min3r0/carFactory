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

        return motorList;
    }

    public static List<Vehicule> initializeListVehicules(List<Mark> listMarques, List<Motor> listMotors){
        final List<Vehicule> vehiculeList = new ArrayList<>();
        vehiculeList.add( new Car("Mustang69", listMotors.get(0), listMarques.get(1), "Yellow",4, 4, 1969, 180, 48, 60, 3, 3, true, false));
        vehiculeList.add( new Car("Peugeot106", listMotors.get(1), listMarques.get(2),"Grey",4, 4, 2002,76000,15, 45,3,3, true, false));
        vehiculeList.add( new Car("Milletipla", listMotors.get(2), listMarques.get(0),"Red",4, 4, 2023, 25, 12, 63,2,2, true, true));

        return vehiculeList;
    }

    public static boolean checkReady (Vehicule vehicule){
        if (vehicule.getMotor().getMotorName().equals("NoMotor")){
            return false;
        }else if(vehicule.getNumberMaxWheel()!= vehicule.getNumberWheelCurrent()){
            return false;
        //}else if(vehicule.){
            //getNnPorteMax
        }else{
            return true;
        }
    }



    public static void main(String[] args) {
        final List<Mark> listMarques = initializeListMark();
        final List<Motor> listMotors = initializeListMotor();
        final List<Vehicule> listVehicules = initializeListVehicules(listMarques, listMotors);

        Print.printVehicule(listVehicules);
        Menu.mainMenu(listVehicules);


    }
}