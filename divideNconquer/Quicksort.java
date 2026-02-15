package divideNconquer;

public class Quicksort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIndx=partition(arr,si,ei);
        quickSort(arr,si,pIndx-1);
        quickSort(arr,pIndx+1,ei);

    }   

    public static int partition(int arr[],int si,int ei){
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }}
        i++;
        int temp=arr[ei];
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;
    }
    

    
    public static void main(String[] args) {
        int arr[]={2,3,5,6,1,4};
        int ei=arr.length-1;
        quickSort(arr,0,ei);
        print(arr);
    }
}
