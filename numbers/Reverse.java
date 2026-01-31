package numbers;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("enter number to get reverse version");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
            int LastDigit=n%10;
            System.out.print(LastDigit);
            n=n/10;
            
        }
        
    }
}
