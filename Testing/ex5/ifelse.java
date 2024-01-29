package ex5;
import java.util.*;
public class ifelse {
    public static void main(String ages[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value :");
        int num=scanner.nextInt();

        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd");
        }


    }
}
