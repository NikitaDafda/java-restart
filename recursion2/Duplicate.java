package recursion2;

public class Duplicate {
    public static void removeDuplicate(String str,int inx,StringBuilder newStr,boolean map[]){
        if(inx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(inx);
        if(map[curr-'a']==true){
            removeDuplicate( str, inx+1, newStr, map);
        }else{
            map[curr-'a']=true;
            removeDuplicate( str, inx+1, newStr.append(curr), map);
        }
    }

    public static void main(String[] args) {
        String str="apna";
        StringBuilder newStr= new StringBuilder("");
        removeDuplicate(str,0,newStr,new boolean[26]);
    }
}
