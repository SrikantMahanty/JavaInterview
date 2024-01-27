package Two_Array;

import java.util.Arrays;

public class Set_Matrix_Zero {


    public static  void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int dumyr[] = new int[r];
        int dumyc[] = new int[c];
        Arrays.fill(dumyr, -1);
        Arrays.fill(dumyc, -1);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    dumyc[j] = 0;
                    dumyr[i] = 0;
                }

            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dumyr[i] == 0 || dumyc[i] == 0) {
                    matrix[i][j] = 0;
                }
            }
            for (int l = 0; l< r; l++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[l][j] + " ");
                }
                System.out.println();


            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        Set_Matrix_Zero.setZeroes(arr);


    }

}
