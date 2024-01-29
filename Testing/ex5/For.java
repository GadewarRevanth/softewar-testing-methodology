package ex5;
import java.util.*;
public class For {
    public static void main(String args[]){
    System.out.println("enter the value :");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    for(int i=1; i<=10 ; i++){
        System.out.println(num+"*"+i+"="+num*i);
    }


    }
}
