package recursion;

public class sum {
    public static int totalSum(int n){
        if(n==0){
            return 0;
        }
        return  n+totalSum(n-1);
       
    }
    public static void main(String[] args) {
       System.out.println(totalSum(5) );
    }
}
