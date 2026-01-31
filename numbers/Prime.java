package numbers;
import java.util.*;
public class Prime {
     public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();

     boolean isprime=true;

        for (int i=2;i*i<=n;i++) {
            if(n%i==0){
                isprime=false;
            }}

            if(isprime==true){
                System.out.println("number is prime");
            }else{
                System.out.println("number is not prime");
            }
        

     }
}
