package Array;

import java.util.HashMap;
import java.util.Map;

public class Factorial_Array {
    public static Map<Integer,Long> memo = new HashMap<>();
    public static long calculate_factorial(int i) {

        if (i ==1) return 1;
        if(memo.containsKey(i)) {
            return memo.get(i);
        }
        long res = i*calculate_factorial(i-1);
        memo.put(i, res);
        return res;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] input = { 10, 5, 20, 23 };
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + ":" + calculate_factorial(input[i]));
        }

    }
}
