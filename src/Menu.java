import java.util.List;
import java.util.Scanner;

public class Menu {
//car's characteristics
    public static void mainMenu(List<Vehicule> vehiculeList){
        System.out.println("""
                What do you want to do?
                1) see the characteristics of a car.
                2) pass the technical control of a vehicle.
                3)""");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action){
            case "1":
                System.out.println("Which car?");
                String characteristicsCar = scanner.nextLine();
                Print.printCharacteristics(vehiculeList.get(Integer.parseInt(characteristicsCar)));

            case "2":
                System.out.println("Which car?");
                String checkReadyCar = scanner.nextLine();
                Print.printCharacteristics(vehiculeList.get(Integer.parseInt(checkReadyCar)));


        }
    }
}
