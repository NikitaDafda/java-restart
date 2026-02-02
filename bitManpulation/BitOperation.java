package bitManpulation;

public class BitOperation {

    // get ith bit

    public static int getBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
        // set ith bit
    public static int setBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    //clear ith bit

    public static int clearBit(int n,int i){
        int bitmask= ~(1<<i);
            return n&bitmask;
        
    }

    //update ith Bit

    public static int updateBit(int n,int i,int newbit){
        n=clearBit(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }

    // update using different approach
public static int updateBit2(int n,int i,int newbit){
        if(newbit==0){
            return clearBit(n,i);
        }
        else{
            return setBit(n,i);
        }
    }



    public static void main(String[] args) {
          
         System.out.println(getBit(3,1));
          System.out.println(getBit(4,2));

           System.out.println(setBit(4,3));

            System.out.println(clearBit(5,2));

             System.out.println(updateBit(4,2,1));
            System.out.println(updateBit2(4,2,1));


    }
}
