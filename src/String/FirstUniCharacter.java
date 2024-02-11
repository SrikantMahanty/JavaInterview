package String;

import java.util.HashMap;

public class FirstUniCharacter {
    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> hs = new HashMap<>();
        for (char c : s.toCharArray()) {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        for (int i=0;i<s.length();i++){
            if(hs.get(s.charAt(i))==1){
                return  i;

            }
        }

        return -1;

    }

    public static void main(String[] args) {
    String s=" leetcode";
    System.out.println(firstUniqChar(s));    }
}
