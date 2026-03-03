package ArrayList;
import java.util.*;

public class LonalyNum{
    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer>list)
{
    ArrayList<Integer> output= new ArrayList<>();
    for(int i=0;i<list.size();i++){
        int num=list.get(i);
        if(!list.contains(num-1) && !list.contains(num+1)){
            output.add(num);
        }else if (output.size()==0){
            System.out.println("no lonely numbers");
        }
        
    }return output;
}   
 public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(8);
        System.out.println(lonelyNumber(list));
    }
}