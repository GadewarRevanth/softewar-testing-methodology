import java.util.*;

public class Power_of_a_b {
    public static void main(String args[]) {
        Scanner Value = new Scanner(System.in);
        System.out.println("Enter the Value of A : ");

        int A = Value.nextInt();
        System.out.println("Enter the Value of B :");

        int B = Value.nextInt();
        double C = Math.pow(A, B);
        int D = (int) C;
        System.out.println("A^B=" + D);

    }
}