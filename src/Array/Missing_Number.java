package Array;

import java.util.HashSet;

public class Missing_Number {

    public  static int missingNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int arr[]={3,0,1};
       int res= Missing_Number.missingNumber(arr);
System.out.println(res);
    }
}
