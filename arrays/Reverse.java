package arrays;
 public class Reverse{
    public static void reverse(int array[]){
        int first=0;
        int last =array.length-1;
        while(first<last){

            int temp=array[first];
            array[first]=array[last];
            array[last]=temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int array[]={1,5,7,3,5,9};
         reverse(array);

         for(int i=0;i<=array.length-1;i++){
        System.out.print(array[i]+" ");
         }
         System.out.println(" ");
        
    }
 }