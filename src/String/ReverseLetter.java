package String;

public class ReverseLetter {
    public static void main(String[] args) {
     String    s = "ab-cd";
     System.out.println(reverseOnlyLetters(s));

    }
    public static String reverseOnlyLetters(String s) {

        int low=0;
        int high=s.length()-1;
        char ch[]=s.toCharArray();

        while(low<high){
            if(!Character.isLetter(ch[low])){
                low++;
            }
            else if(!Character.isLetter(ch[high])){
                high--;
            }
            else{
                char temp=ch[low];
                ch[low]=ch[high];
                ch[high]=temp;
                low++;
                high--;

            }
        }
        return  new String(ch);
    }
}

