package arrays;

public class nagative {
    public static void MaxsubArr(int numbers[]){
    int cs=0;
    int ms=Integer.MAX_VALUE;

    for(int i=0;i<numbers.length;i++){
        cs= cs+numbers[i];
        
       ms=Math.min(cs,ms);
    }
    System.out.println("maximum subarray sum is="+ms);
}

    public static void main(String[] args) {
        int numbers[]={-2,-3,-1,-2,-3};
        MaxsubArr(numbers);
    }
}
