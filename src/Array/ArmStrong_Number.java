package Array;

public class ArmStrong_Number {

    static String armstrongNumber(int n){

        int r=0;
        int sum=0;
        int temp=n;
        while(n>0){
             r=n%10;
            sum+=(r*r*r);
            n/=10;
        }
        if(sum==temp){
            return "Yes";
        }
        return null;

    }

    public static void main(String[] args) {
        int  N = 153;
        System.out.println(ArmStrong_Number.armstrongNumber(N));
    }

}
