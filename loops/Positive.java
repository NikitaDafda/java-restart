package loops;
import java.util.*;
public class Positive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println("enter any number");

        if(number>0){
            System.out.println(number + "is positive");
        }
        else{
            System.out.println(number + "is nagative");
        }
    }
}
