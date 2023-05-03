public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }

    public static void inputException(String userInput) {

        try {
            int userNumber = Integer.parseInt(userInput);
            if (userNumber < 0 || userNumber > 5) {
                throw new CustomException("L'entrée doit être comprise entre 0 et 5 !");
            }
        } catch (NumberFormatException e) {
            System.err.println("L'entrée doit être un nombre !");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
