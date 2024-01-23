package String;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_word {
//    static String revreseword(String str){

//        String arr[] = str.split("\\s+");
//        Collections.reverse(Arrays.asList(arr));
//        String ans=(String.join(" "+arr)) ;
//
//      return ans;
   // }

    public static void main(String[] args) {
        System.out.println("Enter a string of word");
        Scanner scanner =new Scanner(System.in);
        String str=scanner.nextLine();

        String arr[] = str.split("\\s+");
        Collections.reverse(Arrays.asList(arr));
        String ans=(String.join(" "+arr)) ;

          String res=      String.join(" ",ans);
        System.out.print(res);
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
       // Collections.reverse(Arrays.asList(arr));
    }
}
