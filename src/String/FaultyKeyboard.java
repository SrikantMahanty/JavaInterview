//your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
//
//You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
//
//Return the final string that will be present on your laptop screen.



package String;

public class FaultyKeyboard {

//StringBuilder sb=new StringBuilder();
    public static String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='i'){
                sb.reverse();
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
      String  s = "string";
      System.out.println(finalString(s));
    }
}
