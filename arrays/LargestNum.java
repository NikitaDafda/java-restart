package arrays;

public class LargestNum {
    public static int LargestNumber(int arr[]){
        int largest=Integer.MIN_VALUE;int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]>largest){
                largest=arr[i];
            }
             if(arr[i]<smallest){
                smallest=arr[i];
            }
            }         
             System.out.println("smallest number is"+ smallest);

            return largest;
        }

           
    
    public static void main(String[] args) {
        int arr[]={5,3,7,9,1,89};
        System.out.println(" largest number is "+LargestNumber(arr)); 
    }
}
