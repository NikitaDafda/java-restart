package loops;
import java.util.*;
public class PrintNum {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int range=sc.nextInt();
    int count=1;
    while( count<=range){
        System.out.print(count + " ");
        count++;
    }
    System.out.println();


}}
