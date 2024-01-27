package Array;

public class Fibonacci {
    public static  int fib(int num){
        if(num==0){
            return  0;

        }else if (num<=2){
            return  1;

        }else {
            return  fib(num-1)+fib(num-2);
        }
    }

    public static void main(String[] args) {
        int num=4;
        System.out.println(Fibonacci.fib(num));
    }
}
