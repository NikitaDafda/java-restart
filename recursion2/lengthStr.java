package recursion2;

public class lengthStr {
    // finding length of string using recursion
    public static int length(String str,int indx){
        if(indx==str.length()){
            return indx;
        }
        return length(str,indx+1);
    }
    public static void main(String[] args) {
        String str="nikita";
        System.out.println(length(str,1));
    }
}
