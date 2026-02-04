package recursion;

public class factorial {
   public static int Fact(int n){
        if(n==0){
            return 1;
        }
       // int f1=Fact(n-1);
        int f=n*Fact(n-1);

        return f;
   }
 public static void main(String[] args) {
  System.out.println(Fact(5)); 
 }   
}
