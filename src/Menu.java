import java.util.List;
import java.util.Scanner;

public class Menu {
//car's characteristics
    public static void mainMenu(List<Vehicule> vehiculeList){
        String userInputSwitch = "";
        String userInputList = "";
        do {
            System.out.println("""
                What do you want to do?
                1) see the characteristics of a car.
                2) see the characteristics of motor of a car.
                3) see the characteristics of mark of a mark.
                4) pass the technical control of a vehicle.
                5) drive a vehicle.""");


            Scanner scanner = new Scanner(System.in);
             userInputSwitch = scanner.nextLine();
            UserInputUtils.inputException(userInputSwitch,1,5);

            switch (userInputSwitch){
                case "1":
                    System.out.println("Which car?");
                    userInputList = scanner.nextLine();
                    if (UserInputUtils.inputExceptionBool(userInputList,1, vehiculeList.size()){
                        Print.printCharacteristicsVehicule(vehiculeList.get(Integer.parseInt(userInputList)-1));
                    }
                    break;
                case "2":
                    System.out.println("Which car?");
                    userInputList = scanner.nextLine();
                    Print.printCharacteristicsMotor(vehiculeList.get(Integer.parseInt(userInputList)-1).getMotor());
                    break;

                case "3":
                    System.out.println("Which car?");
                    userInputList = scanner.nextLine();
                    Print.printCharacteristicsMark(vehiculeList.get(Integer.parseInt(userInputList)-1).getMark());
                    break;

                case "4":
                    System.out.println("Which car?");
                    userInputList = scanner.nextLine();
                    Factory.checkReady(vehiculeList.get(Integer.parseInt(userInputList)-1));
                    break;

                case "5":
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + userInputSwitch);
            }
        }while(!userInputSwitch.equals("5"));

    }
}
