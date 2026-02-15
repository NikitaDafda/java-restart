package divideNconquer;
    //Searcj in sorted and rotated array
public class Rotated {
    public  static int Search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2; // or si+ei/2
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr,tar,si,mid-1);
            }else{
                return Search(arr,tar,mid+1,ei);
            }

        } else {
            if(arr[mid]<=tar && tar <=arr[ei]){
                return Search(arr,tar,mid+1,ei);
            }else{
                return Search(arr,tar,si,mid-1);
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
       int target= Search(arr,tar,0,arr.length-1);
        System.out.println(target);
    }
}
