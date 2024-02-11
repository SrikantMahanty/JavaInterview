package SortingAlgorithms;

public class SelectionSort {

    public static void sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            int small=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[small]>nums[j]){
                    small=j;
                }
            }
            int temp=nums[small];
            nums[small]=nums[i];
            nums[i]=temp;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums []={8,3,2,1,5};

        SelectionSort.sort(nums);
    }
}
