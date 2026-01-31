package arrays.Darray;

public class spiral {
    public static void PrintSpiral(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;
       
 while(StartRow<=EndRow && StartCol<=EndCol ){
     //top line
        for(int i=StartCol;i<=EndCol;i++){
            System.out.print(matrix[StartRow][i]+" ");
        }
    //left
        for(int j=StartRow+1;j<=EndRow;j++){
            System.out.print(matrix[j][EndCol]+" ");
        }
    //bottom
    for(int i=EndCol-1;i>=StartCol;i--){
        System.out.print(matrix[EndRow][i]+" ");
    }
    //left
    for(int j=EndRow-1;j>=StartRow+1;j--){
        System.out.print(matrix[j][StartCol]+" ");
    }
    StartCol++;
    StartRow++;
    EndCol--;
    EndRow--;
    }
    System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

                        PrintSpiral(matrix);
    }
    
}
