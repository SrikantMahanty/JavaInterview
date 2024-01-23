package Array;

class Distance_TwoArray {
    public static  int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int dis = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] - arr2[j] <= d) {
                    dis++;
                    break;
                }
            }
        }

        return dis;
    }

    public static void main(String[] args) {
        int  [] num1={4,5,8};
        int []arr2 = {10,9,1,8};int  d = 2;
        System.out.println(Distance_TwoArray.findTheDistanceValue(num1,arr2,d));
    }
}
