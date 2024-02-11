package String;

public class RevVowel {
    private static boolean IsVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public  static String reverseVowels(String S){
        int n=S.length();
        int s=0;
        int l=n-1;
        char [] c=S.toCharArray();
        while (s<l){
            if(!IsVowel(c[s])){
                s++;


            }else if (!IsVowel(c[l])){
                l--;
            }else {
                char temp=c[s];
                c[s]=c[l];
                c[l]=temp;
                s++;
                l--;
            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
      String  s = "hello";
      System.out.println(reverseVowels(s));
    }
}
