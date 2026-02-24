package backTracking;

public class Gridway {
    //only two possible moves down and right
    public static int totalGridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1=totalGridWays(i+1,j,n,m);
        int w2=totalGridWays(i,j+1,n,m);
        return w1+w2;

    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(totalGridWays(0,0,n,m));
    }
    // time complexity= O(2^n+m);
}
