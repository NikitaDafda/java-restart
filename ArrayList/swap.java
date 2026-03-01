package ArrayList;
import java.util.*;
public class swap {
    public static void swapElements(ArrayList<Integer> list,int indx1,int indx2){
         int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
          list.set(indx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("befoe swap"+list);

        swapElements(list,2,3);
        System.out.println("after swap"+list);
    }
}
