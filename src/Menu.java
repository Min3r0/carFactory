import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void mainMenu(List<Vehicule> vehiculeList){
        System.out.println("What do you want ?\n" +
                "1) voir les caracteristiques d'une voiture\n" +
                "2) passer un control technique a un vehicule\n" +
                "3)");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action){
            case "1":
                System.out.println("quelle voiture ?");
                String caracteristicCar = scanner.nextLine();
                Print.printCaracteristic(vehiculeList.get(Integer.parseInt(caracteristicCar)));

            case "2":
                System.out.println("quelle voiture ?");
                String checkReadyCar = scanner.nextLine();
                Print.printCaracteristic(vehiculeList.get(Integer.parseInt(checkReadyCar)));


        }
    }
}
