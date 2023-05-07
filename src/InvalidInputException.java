public class InvalidInputException extends CustomException {
    public InvalidInputException(String input) {
        super("Invalid input: " + input + ". Expected 'y' or 'n'.");
    }
}
