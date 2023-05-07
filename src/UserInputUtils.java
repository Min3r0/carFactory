public class UserInputUtils {

    public static void inputException(String userInput, int minValue, int maxValue) {

        try {
            int userNumber = Integer.parseInt(userInput);
            if (userNumber < minValue || userNumber > maxValue) {
                throw new CustomException("The input must be between " + minValue + " and " + maxValue + " !");
            }
        } catch (NumberFormatException e) {
            System.err.println("The entry must be a number !");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }

    public static boolean inputExceptionBool(String userInput, int minValue, int maxValue) {

        try{
            int userNumber = Integer.parseInt(userInput);
            if (userNumber < minValue || userNumber > maxValue) {
                throw new CustomException("The input must be between " + minValue + " and " + maxValue + " !");
            }
        } catch (NumberFormatException e) {
            System.err.println("The entry must be a number !");
            return true;
        } catch (CustomException e) {
            System.err.println(e.getMessage());
            return true;
        }
        return false;
    }

    public static String inputExceptionYesNo(String userInput){
        try {
            if (!userInput.equals("y") && !userInput.equals("n")) {
                throw new InvalidInputException(userInput);
            }
            // Le code ici pour le cas où l'entrée est valide
        } catch (CustomException e) {
            System.out.println(e.getMessage()); // Affiche "Invalid input: . Expected 'y' or 'n'."
            return "o";
        }
    }

}
