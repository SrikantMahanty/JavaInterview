package Array;

public class Factorial {

    public static  int main(int num){
        if(num ==0){
            return  1;

        }else {
             return num*main(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial.main(3));
    }
}
