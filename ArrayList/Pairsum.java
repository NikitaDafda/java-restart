package ArrayList;
import java.util.*;
// finding pairsum is exist in AL
// time= O(n);
public class Pairsum {
    public static boolean isPairSum(ArrayList<Integer>list,int target){
        int lp=list.get(0);
        int rp=list.get(list.size()-1);
       while(lp<rp){
            if(lp+rp==target){
                return true;
            }else if(lp+rp<target){
                lp++;
            }else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        

       System.out.println(isPairSum(list,50)); 
       System.out.println(isPairSum(list,5)); 


    }
}
