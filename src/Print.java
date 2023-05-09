import java.util.List;

public class Print {
    public static void printVehicule (List<Vehicule> vehiculeList){
        System.out.println("---------------------");
        for (int i = 0; i<vehiculeList.size(); i++ ){
            System.out.println(i+1 + ") " + vehiculeList.get(i).getMark().getMarkName() + " " + vehiculeList.get(i).getName());
        }
        System.out.println("---------------------");
    }

    public static void printCharacteristicsVehicule(Vehicule vehicule){
        System.out.println("---------------------");
        System.out.print(vehicule.getMark().getMarkName() + "  " + vehicule.getName() + "\n"
                + vehicule.getMotor().getMotorName() + "   year of construction: " + vehicule.setConstructionYear() +"\n"
                + "has travelled: " +vehicule.getKmTravelled() + "km   can drive: " + vehicule.checkReady()+"\n"
                + "has a reservoir of " + vehicule.getTankCapacity() + "L and it has in it " + vehicule.getRemainingFuel() + "L \n");
        System.out.println("---------------------");

    }

    public static void printCharacteristicsMark(Mark mark){
        System.out.println("---------------------");
        System.out.print(mark.getMarkName() + " is a brand created in " + mark.getCreationDate()+ " in " +mark.getOrigin() + "\n");
        System.out.println("---------------------");


    }

    public static void printCharacteristicsMotor(Motor motor){
        System.out.println("---------------------");
        System.out.print(motor.getMotorName() + "   V"+ motor.getNumberPiston()+"\n"+
                motor.getHorsepower()+"HorsePower   "+motor.getCouple()+"Nm \n"+
                motor.getCylinderCapacity()+"cm²   "+motor.getConsumption()+"L/100 Km");
        System.out.println("---------------------");
    }

}
