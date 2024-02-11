package SortingAlgorithms;

public class Bubblesort {
//0(n^2)
    public static void sort(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){//n-1
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums []={8,3,2,1,5};

       Bubblesort.sort(nums);

    }
}
