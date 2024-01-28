package Array;

import java.util.HashSet;

public class misMatchArray {

    public  static int[] findErrorNums(int[] nums) {

        int ans[] = new int[2];
        HashSet<Integer> hashSet = new HashSet<>();
        int n = nums.length;
        int Exsum = n * (n + 1) / 2;
        int acSum = 0;
        for (int i : nums) {
            if (hashSet.contains(i)) {
                ans[0] = i;
            } else {
                hashSet.add(i);

            }
            acSum += i;
        }
        ans[1] = Exsum - (acSum - ans[0]);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        int result[] = misMatchArray.findErrorNums(arr);

        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }

}
