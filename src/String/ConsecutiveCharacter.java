package String;

public class ConsecutiveCharacter {


    public  static int maxPower(String s){
        int n=s.length()-1;
        int res=0;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;

            }else {
                cnt=0;
                res=Math.max(cnt,res);
            }
        }
        return Math.max(res,cnt)+1;
    }

    public static void main(String[] args) {
        String  s = "leetcode";
        System.out.println(maxPower(s));
    }
}
