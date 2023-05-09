public class UserInputUtils {

    public static boolean inputExceptionInt(String userInput){
        try {
            int userNumber = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.err.println("The entry must be a number !");
            return true;
        }
        return false;
    }

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

        try {
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
            if (!userInput.equals("y") && !userInput.equals("n") &&!userInput.equals("Y") && !userInput.equals("N")) {
                throw new CustomException("Invalid input (y or n)");
            } else if (userInput.equals("y")||userInput.equals("Y")) {
                return "y";
            } else{
                return "n";
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            return "y";
        }
    }

}
