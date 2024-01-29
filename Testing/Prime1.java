import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 2) {
                System.out.println("Prime numbers are greater than or equal to 2.");
            } else {
                boolean isPrime = checkPrime(number);
                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        } else {
            System.out.println("Invalid input,\n You are using special character, \n Please enter a valid integer.");
        }

        scanner.close();
    }

    private static boolean checkPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        if (number < 2 || number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
}
