package recursion;

public class Power {

    public static int powerOf(int x,int n){
        if(n==0){
            return 1;
        }

        return (x*powerOf(x,n-1));
    }
    public static void main(String[] args) {
        System.out.println(powerOf(2,10)); // 2^10
    }
}
