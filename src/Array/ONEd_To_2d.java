package Array;

public class ONEd_To_2d {

    public  static int [][] construct2DArray(int[] original, int m, int n) {

      if(original.length!=m*n){
          return new int [0][0];
      }
        int ans [][]=new int[m][n];
      int cnt=0;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              ans[i][j]=original[cnt];
              cnt++;
          }
      }
        return ans;

    }

    public static void main(String[] args) {
      int []  original = {1,2,3,4};
      int n=2;
      int m=2;
        // Construct the 2D array and print it
        int[][] result = construct2DArray(original, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
