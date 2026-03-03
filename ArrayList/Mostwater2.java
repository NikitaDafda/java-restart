package ArrayList;

import java.util.ArrayList;

//Optimized approach 
//time compexity= O(n) 
public class Mostwater2 {

public static int storeWater(ArrayList<Integer> height){
    int max=0;
    int lp=height.get(0);
    int rp=height.size()-1;
    while(lp<rp){
        int ht= Math.min(height.get(rp),height.get(lp));
        int width=rp-lp;
        int currWater=ht*width;
         max=Math.max(max,currWater);

         if(height.get(lp)<height.get(rp)){
            lp++;
         }else{
            rp--;
         }

    }return max;
}
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

       System.out.println(storeWater(height)); 

    }
    }

