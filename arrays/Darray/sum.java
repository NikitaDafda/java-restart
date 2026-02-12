package arrays.Darray;

public class sum {
    //printing sum of 2nd row
    public static int rowSum(int nums[][]){

        int row=0;
        int col=nums[0].length-1;
        int sum=0;
        for(int i=row+1;i<=col;i++){
            sum+=nums[row][col];
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[][]= { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("sum is"+rowSum(nums)); ;
        
    }
}
