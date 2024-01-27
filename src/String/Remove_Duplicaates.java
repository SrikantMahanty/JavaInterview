package String;

import java.util.HashSet;

public class Remove_Duplicaates {

    public static  String  Duplicates(String str) {
        String ans = "";

        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {

            if (hs.add(str.charAt(i))) {
                sb = new StringBuilder();
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();




        }

    public static void main(String[] args) {
        String str="bcabc";
        System.out.println(Remove_Duplicaates.Duplicates(str));
    }
    }
