package ArrayList;
import java.util.ArrayList;


public class Operations {
    public static void main(String[] args) {
        //declaration
        ArrayList<Integer> list=new ArrayList<>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3,5);
        System.out.println(list);

        //remove element at index
        list.remove(3);   
        System.out.println(list);

        //set element
        list.set(2,3);
        System.out.println(" set "+list);

        //get element
        System.out.println(" get "+list.get(3)); 

        //contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11)); 
        
        
      

    }
}
