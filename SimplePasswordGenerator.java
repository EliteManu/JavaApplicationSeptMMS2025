import java.util.Random;

public class SimplePasswordGenerator {

    public static String generatePassword(int length) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String combinedChars = capitalLetters + lowerCaseLetters + numbers;
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(combinedChars.length());
            password.append(combinedChars.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
           System.out.println("Your password is: " + generatePassword(10));
    }
}
