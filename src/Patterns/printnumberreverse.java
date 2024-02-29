package Patterns;

public class printnumberreverse {
    public static void main(String[] args) {
        printnum(10);

    }
    static void  printnum(int n){
        int sum=0;
        for(int i=n;i>=0;i--){
            System.out.print(i+" ");
            sum+=i;
            System.out.println(sum);
        }

    }
}
