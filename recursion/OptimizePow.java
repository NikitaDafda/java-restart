package recursion;

public class OptimizePow {
    public static int PowerOf(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=PowerOf(x,n/2);
        int halfpowSq= halfpow*halfpow;
        if(n%2 != 0){
            return x*halfpowSq;
        }

        return halfpowSq;
    }
    public static void main(String[] args) {
        System.out.println(PowerOf(2,7));    
    }
}
