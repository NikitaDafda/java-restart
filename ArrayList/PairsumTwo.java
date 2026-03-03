package ArrayList;
import java.util.*;
// find pairsum in sorted and roatated ArrayList using 2 point approach and modular arithmetic
public class PairsumTwo {
    public static boolean pairSum(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
            int lp=bp+1; // smallest 
            int rp=bp; // largest
             
       while(lp!=rp){
        //case 1
            if(list.get(lp)+list.get(rp)==target){
              System.out.println("pairsum is"+list.get(lp)+"and"+list.get(rp));
              return true;
        //case 2
            }else if(list.get(lp)+list.get(rp)<target){
                lp=((lp+1)%n);
        //case 3
            }else{
                rp=((n+rp-1)%n);
            }
     }  return false;
                
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
       System.out.println(pairSum(list,19 )); 
    }
}
