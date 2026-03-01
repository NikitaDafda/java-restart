package ArrayList;
import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
         list.add(5);
          list.add(4);
           list.add(2);
            list.add(3);

            int min =Integer.MIN_VALUE;
            for(int i=0;i<=list.size()-1;i++){
                if(list.get(i)>min){
                    min=list.get(i);
                    System.out.println(min);
                }

            }
        
    }
}
