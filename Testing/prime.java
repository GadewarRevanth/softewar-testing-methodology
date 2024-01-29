import java.util.*;

class prime {
    public static void main(String args[]) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = prime.next();
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + ":Not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(n + ": is a prime number");
        }

    }
}
