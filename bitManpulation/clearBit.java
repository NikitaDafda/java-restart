package bitManpulation;

public class clearBit {
    public static int clearithBit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

    public static int clearRange(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        int bitmask=(a|b);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearRange(10,2,4));
    }
}
