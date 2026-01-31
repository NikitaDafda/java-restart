package arrays.assigment;

public class duplicate {
    public static int duplicate(int matrix[][],int num){
        int number=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==num){
                    number++;
                }
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        int num=8;

        System.out.println(duplicate(matrix,num));
    }
}
