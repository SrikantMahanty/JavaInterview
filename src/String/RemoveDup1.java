package String;

import java.util.HashSet;

public class RemoveDup1 {
    public static String dup(String str){
        String sb="";
        HashSet  <Character> hs=new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(hs.add(str.charAt(i))){
                sb+=str.charAt(i);
            }
        }
        return  sb;

    }
    public static void main(String[] args) {
        String str="bcabc";
        System.out.println(Remove_Duplicaates.Duplicates(str));
    }
}
