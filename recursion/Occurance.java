package recursion;
 public class Occurance{

        // checking first occurance

    public static int FirstOccurance(int arr[],int key,int i){
        if( i==arr.length-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return FirstOccurance(arr,key,i+1);
    }
        // cheking last occurance

    public static int LastOccurance(int arr[],int key,int i){
        if( i==arr[0]){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return LastOccurance(arr,key,i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,5,7,8,5,9};
        System.out.println(FirstOccurance(arr,5,0)); // output=3
        System.out.println(LastOccurance(arr,5,7)); // output=6

    }
 }