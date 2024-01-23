package String;

public class ValidPalindrome {

    static boolean main(String str){
        String res=str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String rev=new StringBuffer(res).reverse().toString();
        return res.equals(rev);

    }

    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(ValidPalindrome.main(str));
    }
}

