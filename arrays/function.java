package arrays;

public class function {

    public static void incrementMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={96,97,98};
           incrementMarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }     

    }
}
