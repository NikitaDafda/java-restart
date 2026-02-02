package bitManpulation;

public class oddEven {
    public static void checkOddEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        checkOddEven(3);
        checkOddEven(5);
        checkOddEven(2);
        checkOddEven(10);

    }
}
