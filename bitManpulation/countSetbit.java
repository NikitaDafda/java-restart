package bitManpulation;

public class countSetbit {
    public static int countSetBit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){ //checking lsb (if 1 =count increse)
                count ++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(15));
    }
}
