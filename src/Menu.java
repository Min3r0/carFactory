import java.util.List;
import java.util.Scanner;

public class Menu {
//car's characteristics
    public static void mainMenu(List<Vehicule> vehiculeList){
        System.out.println("""
                What do you want to do?
                1) see the characteristics of a car.
                2) see the characteristics of motor of a car.
                3) see the characteristics of mark of a mark.
                4) pass the technical control of a vehicle.
                5) drive a vehicle.""");

        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action){
            case "1":
                System.out.println("Which car?");
                String characteristicsCar = scanner.nextLine();
                Print.printCharacteristicsVehicule(vehiculeList.get(Integer.parseInt(characteristicsCar)-1));
                break;

            case "2":
                System.out.println("Which car?");
                String characteristicsMotor = scanner.nextLine();
                Print.printCharacteristicsMotor(vehiculeList.get(Integer.parseInt(characteristicsMotor)-1).getMotor());
                break;

            case "3":
                System.out.println("Which car?");
                String characteristicsMark = scanner.nextLine();
                Print.printCharacteristicsMark(vehiculeList.get(Integer.parseInt(characteristicsMark)-1).getMark());
                break;

            case "4":
                System.out.println("Which car?");
                String checkReady = scanner.nextLine();
                Factory.checkReady(vehiculeList.get(Integer.parseInt(checkReady)-1));
                break;

            case "5":
        }
    }
}
