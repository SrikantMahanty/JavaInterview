package String;

public class FirstOccIndexString {



    public  static  int strStr(String haystack, String needle) {
        if(haystack.startsWith(needle))
            return 0;
            return haystack.indexOf(needle);

    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
