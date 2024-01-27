package String;

public class LenghtLast_word {

    public static  int length(String str) {

        if (str.length() == 0) {
            return 0;
        }
            int max = 0;
            String[] st = str.split(" ");
            for (String ch : st) {
                if (ch.length() > 0) {
                    max = ch.length();
                }
            }


        return max;

    }

    public static void main(String[] args) {
         String str=" hii ia m srikant";
         System.out.println(LenghtLast_word.length(str));
    }
}
