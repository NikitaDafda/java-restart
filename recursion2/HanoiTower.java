package recursion2;
public class HanoiTower{
    public static void  TOH(int n,char A,char B,char C){
    // A->source 
    // B-> helper
    //  c-> destination

        if(n==0){
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println(A + "to" +C);
        TOH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        TOH(2,'A','B','C');
        System.out.println("for 3 disks");
        TOH(3,'A','B','C');
        
    }
}