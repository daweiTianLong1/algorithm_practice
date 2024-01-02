package generatematrix;

import java.util.Arrays;

/**
 * @Description:
 * @Author: PanYi
 * @Date: 2023/9/28
 */

public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++) mat[t][i] = num++; // left to right.
            t++;
            for(int i = t; i <= b; i++) mat[i][r] = num++; // top to bottom.
            r--;
            for(int i = r; i >= l; i--) mat[b][i] = num++; // right to left.
            b--;
            for(int i = b; i >= t; i--) mat[i][l] = num++; // bottom to top.
            l++;
        }
        return mat;
    }

    public static void main(String[] args) {
        GenerateMatrix generateMatrix = new GenerateMatrix();
        int n = 3;
        int[][] ints = generateMatrix.generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }

}
