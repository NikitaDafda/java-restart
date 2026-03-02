package ArrayList;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         list.add(5);
         list.add(9);
         list.add(4);
         list.add(1);
         list.add(6);
        Collections.sort(list);  // acending order
         System.out.println(list);

         Collections.sort(list,Collections.reverseOrder()); // decending order
         System.out.println(list);
    }
}
