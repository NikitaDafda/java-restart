package recursion2;

public class KeyOccur {
    public static int keyOccurance(int arr[],int indx,int key){
        if(indx==arr.length-1){
            return indx;
        }
        if(arr[indx]==key){
            System.out.println(indx);
        }
           return keyOccurance(arr,indx+1,key);
        
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,3};
        System.out.print(keyOccurance(arr,0,3));    
    }
}
