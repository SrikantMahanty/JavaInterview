package String;

public class LengthOfLastWord {

    public static void main(String[] args) {

      String  s = "Hello World";
      System.out.println(lengthOfLastWord(s));

    }
    public  static int lengthOfLastWord(String s) {

//        String str=s.trim();
//        int cnt=0;
//        try {
//
//
//        for(int i=str.length()-1;i>=0;i--){
//            if(str.charAt(i)!= ' '){
//                cnt++;
//            }else{
//                break;
//            }
//        } }
//        catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        return cnt;

        int max=0;
        if(s.length()==0){
            return 0;
        }
        String []str=s.split(" ");
        for(String string:str){
          //  System.out.println(str[Integer.parseInt(string)]);
            if(string.length()>0){
                System.out.println(string);
                max=string.length();
            }
        }
        return max;
    }

}
