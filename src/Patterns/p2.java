package Patterns;

public class p2 {
    public static void main(String[] args) {
        patternPrint(4);
    }
    static void patternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
