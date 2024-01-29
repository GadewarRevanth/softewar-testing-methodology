import java.util.*;

class Greatest_3Num {
    public static void main(String args[]) {
        System.out.println("The Renge is [1,20]");
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the value for A :");
        int A = value.nextInt();
        System.out.println("Enter the value for B :");
        int B = value.nextInt();
        System.out.println("Enter the value for C :");
        int C = value.nextInt();

        if ((A >= 1 && A <= 20) && (B >= 1 && B <= 20) && (C >= 1 && C <= 20)) {
            // if ((A != 0 && A <= 20) && (B != 0 && B <= 20) && (C != 0 && C <= 20)) {
            System.out.println("Valid Range inputes");
            if ((A > B || A == B) && (A > C || A == C)) {
                System.out.println("A is Greatest");
            } else if (B > C) {
                System.out.println("B is Greatest");
            } else {
                System.out.println("C id Greatest");
            }
        } else if (A < 1 || A > 20 || B < 1 || B > 20 || C < 1 || C > 20) {
            System.out.println("Invalid input");
        }

    }
}