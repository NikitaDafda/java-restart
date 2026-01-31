package arrays;

public class Subarray {
    public static void PrintSubArray(int array[]){
        int n=array.length-1;
        int ts = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;   // reset sum for each subarray

                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                }

                ts++;
                System.out.print(" -> Sum = " + sum);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total subarrays = " + ts);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        PrintSubArray(array);
    }
}

                   
            
           
   