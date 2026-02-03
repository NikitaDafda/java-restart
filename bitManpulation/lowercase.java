package bitManpulation;

public class lowercase {
    public static char tolowercase(char ch){
        while(ch>='A' && ch<='Z'){
            return (char)(ch|32);
        }
        return ch;
    }
    public static void main(String[] args) {
        System.out.println(tolowercase('G'));
    }
}
