public class UserInputUtils {

    public static void inputException(String userInput, int minValue, int maxValue) {

        try {
            int userNumber = Integer.parseInt(userInput);
            if (userNumber < minValue || userNumber > maxValue) {
                throw new CustomException("L'entrée doit être comprise entre " + minValue + " et " + maxValue + " !");
            }
        } catch (NumberFormatException e) {
            System.err.println("L'entrée doit être un nombre !");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void inputExceptionBool(String userInput, int minValue, int maxValue) {

        try {
            int userNumber = Integer.parseInt(userInput);
            if (userNumber < minValue || userNumber > maxValue) {
                throw new CustomException("L'entrée doit être comprise entre " + minValue + " et " + maxValue + " !");
            }
        } catch (NumberFormatException e) {
            System.err.println("L'entrée doit être un nombre !");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
