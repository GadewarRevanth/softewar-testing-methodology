package ex5;
import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num form 1 to 7 to get day names : ");
        int day=scanner.nextInt();
        switch(day){
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tusday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thusday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;


            default:
            System.out.println("Enter the number between 1 to 7 ");
            break;

        }

    }
}
