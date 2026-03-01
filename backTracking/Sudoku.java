package backTracking;

public class Sudoku {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //row condition
    for(int i=0;i<=8;i++){
        if(sudoku[i][col]==digit){
            return false;
        }
    }

    //column condition
    for(int j=0;j<=8;j++){
        if(sudoku[row][j]==digit){
            return false;
        }
    }

    //grid condition 

}
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9 && col==9){
            return true;
        }else if(row==9){
            return false;
        }

        int nextRow=row;
        int nextCol=col+1;
        if(nextCol==9){
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(sudoku)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                return true;
            }}
            
        }
        sudoku[row][col]=0;

    }
    public static void main(String[] args) {
        int[][] sudoku = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};


    }
}
