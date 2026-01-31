package arrays.Darray;

public class Search {
    public static boolean search(int matrix[][],int key){

        int row=0;
        int col=matrix.length-1;

        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("key found at index"+"(" +row+","+col+")");
                return true;
            }
           else if(key<matrix[row][col]){
            col--;
           }else if(key>matrix[row][col]){
            row++;
           }else{
            System.out.print("key not found !");
           }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=35;
        search(matrix,key);
        System.out.println();
    }
}
