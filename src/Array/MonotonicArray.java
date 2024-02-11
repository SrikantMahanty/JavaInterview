package Array;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean in=true;
        boolean de=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                de=false;
            }
            if(nums[i]>nums[i-1]){
                in=false;
            }

        }
        return  de||in;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1};
       System.out.println(isMonotonic(nums));
    }
}