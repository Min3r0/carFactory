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
}
