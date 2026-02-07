package recursion2;

public class Tiles {
    public static int tileProblem(int n){ // floor 2*n

        //base case
        if(n==0 || n==1){
            return 1;
        }
    
        // if tile placed vertically
        int vertical=tileProblem(n-1);

        // if tile placed horizontally
        int horizontal=tileProblem(n-2);

        //number of ways to place tiles
        int totalway= vertical+horizontal;

        return totalway;
    }
    public static void main(String[] args) {
        System.out.println(tileProblem(3));
        System.out.println(tileProblem(2));
        System.out.println(tileProblem(6));
    }
}
