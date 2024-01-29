import java.util.Scanner;

public class prime11 {
    public static void main(String args[]) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter the value :");
        int num = val.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("Not a Prime number");
        } else if (num == 2 || num == 3) {
            System.out.println("Prime number");
        } else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Not a Prime number");
        } else if (num % 2 != 0 || num % 3 != 0) {
            System.out.println("Prime number");
        }
    }

}
