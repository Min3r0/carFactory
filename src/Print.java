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
                + vehicule.getMotor().getMotorName() + "   année de construction: " + vehicule.setConstructionYear() +"\n"
                + "a parcouru: " +vehicule.getKmTravelled() + "km   peut rouler: " + vehicule.checkReady()+"\n"
                + "a un reservoir de " + vehicule.getTankCapacity() + "L et il y a dedans " + vehicule.getRemainingFuel() + "L \n");
        System.out.println("---------------------");

    }

    public static void printCharacteristicsMark(Mark mark){
        System.out.println("---------------------");
        System.out.print(mark.getMarkName() + " est une marque creer en " + mark.getCreationDate()+ " en " +mark.getOrigin() + "\n");
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
