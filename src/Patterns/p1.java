package Patterns;

public class p1 {
    public static void main(String [] args){
        pattern(4);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            //for every row,run the col
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            //when one row is printed ,we need to add a newline
            System.out.println();
        }
    }
}
