package Patterns;

import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no og lines print ::");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(n-i+1+64));
            }
            System.out.println();
        }
    }
}
