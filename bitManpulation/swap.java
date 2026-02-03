package bitManpulation;

public class swap {
    public static void main(String[] args) {
        int x=3;
        int y=4;

        System.out.println("before swap"+" " +"x="+x+","+"y="+y);
         x=x^y;
         y=x^y;
         x=y^x;

         System.out.println("after  swap" +" " +"x="+x+","+"y="+y);
    }
}
