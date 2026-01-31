package arrays;
import java.util.*;

public class mark {
    public static void main(String[] args) {
        int marks[]=new int [100];

        Scanner sc =new Scanner (System.in);
        
        marks[0]=sc.nextInt();

        System.out.println("enter marks of physics "+ marks[0]);
        marks[1]=sc.nextInt();

        System.out.println("enter marks of math "+ marks[1]);
        marks[2]=sc.nextInt();

        System.out.println("enter marks of chem "+ marks[2]);


        int avg=(marks[0]+marks[1]+marks[2])/3;
        
        System.out.println("percrntage is"+ avg);

        
    }
}

