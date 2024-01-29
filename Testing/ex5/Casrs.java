package ex5;
import java.util.*;
public class Casrs {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num form 1 to 2 to get cars names : ");
        int day=scanner.nextInt();
        switch(day){
            case 1:
            System.out.println("BMW");
            break;

            case 2:
            System.out.println("Ford");
            break;



            default:
            System.out.println("Enter the number between 1 to 2 ");
            break;

        }

    }
}
