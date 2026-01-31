
package arrays;
public class linear{
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
        return 1;            }
           
        }
        return -1; 
        
    }
    public static void main(String[] args) {
        int numbers[]={10,20,35,60,48};
        int key=6;
    int index=linearSearch(numbers,key);

    if(index==1){
    System.out.println("key at index" +index);

    }else{
        System.out.println("key not found");

    }
    }
}