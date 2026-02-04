package recursion;
public class fibonachhi{
    public static int Fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1=Fibo(n-1);
        int fib2=Fibo(n-2);
        int fib=fib1+fib2;
        
        return fib;
    }
    public static void main(String[] args) {
      System.out.println(Fibo(7) );
    }
}