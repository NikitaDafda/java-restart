package arrays;

public class BinarySearch {
    public static int Search(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,5,7,9};
        int key=5;
        int index=Search(numbers,key);
        if(index==-1){
            System.out.println("key not exist !");
        }else{
        System.out.println("key found at index"+Search(numbers,key));
        }
    }
}