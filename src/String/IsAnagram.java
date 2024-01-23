package String;

import java.util.Arrays;

//An Anagram is phase or word by rearranging the letters of a different word ,typically exact the same
public class IsAnagram {

     static boolean main(String str1,String str2){
         if(str1.length()!=str2.length()){
             return false;
         }
         char [] c1=str1.toCharArray();
         char []c2=str2.toCharArray();

         Arrays.sort(c1);
         Arrays.sort(c2);

         return  Arrays.equals(c1,c2);

     }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(IsAnagram.main(s,t));
    }


}
