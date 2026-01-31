package arrays;

public class MaxSubarray {
    public static void maxSub(int array[]){
        int n=array.length-1;
        int max=Integer.MIN_VALUE;
        int sum=0;
    for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    
                    sum += array[k];
                    
                }
                System.out.println("sum is"+sum);
                if(sum>max){
                    max=sum;
                }
                
            }
        }
                System.out.println("max sum is"+max);
    }

    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        maxSub(array);
    }
}

