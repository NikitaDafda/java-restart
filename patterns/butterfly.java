package patterns;

public class butterfly {
    public static void main(String[] args) {
     int n=4;
            //first half...
     for(int i=1;i<=n;i++){
//stars     
             for(int j=1;j<=i;j++){
            System.out.print("*");
        }
//space
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
//stars    
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println( );
        }

        // second half...


for(int i=n;i>=1;i--){
    
    //copy-paste of above code

        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
//space
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
 //stars    
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println( );
        }

        
     }   
    }

