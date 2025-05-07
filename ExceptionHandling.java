class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 1) {
            throw new InvalidAgeException("Age cannot be less than 1");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(0);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
