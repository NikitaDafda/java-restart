package ArrayList;
import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        mainList.add(list2);

        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        mainList.add(list3);

        
        

        System.out.println(list);
        System.out.println(list2);
         System.out.println(list3);


        System.out.println(mainList);

    }
}

