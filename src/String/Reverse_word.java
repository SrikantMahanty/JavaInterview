package String;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_word {
    static String revreseword(String str){

        String arr[] = str.split(" +");
//        Collections.reverse(Arrays.asList(arr));
//        String ans=(String.join(" "+arr)) ;
//
//      return ans;

        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb .append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

      String   s = "the sky is blue";
      System.out.println(Reverse_word.revreseword(s));

//        System.out.println("Enter a string of word");
//        Scanner scanner =new Scanner(System.in);
//        String str=scanner.nextLine();
//
//        String arr[] = str.split("\\s+");
//        Collections.reverse(Arrays.asList(arr));
//        String ans=(String.join(" "+arr)) ;
//
//          String res=      String.join(" ",ans);
//        System.out.print(res);
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
       // Collections.reverse(Arrays.asList(arr));
    }
}
