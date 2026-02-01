package strings;

public class StringBuilderDemo {
    public static void ToUpperCase(String str){
        StringBuilder sb=new StringBuilder(" ");
        for(int i=0;i<=str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }

    }
    public static void main(String[] args) {
        String str="hi my name is nikita";
        ToUpperCase(str);
    }
}
