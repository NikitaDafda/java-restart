package recursion2;

public class BinaryString {
    // code for binary strings which not have consecutive ones
    public static void BinaryStr(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        
        BinaryStr(n-1,0,str+"0");
    
        if(lastPlace==0) {
        BinaryStr(n-1,1,str+"1");
    }
    }
    
    public static void main(String[] args) {
        BinaryStr(3,0,"");
        
    }
    }


