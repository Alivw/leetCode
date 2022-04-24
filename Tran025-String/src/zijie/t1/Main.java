package zijie.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt();
        int nums[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(nums, i, j));
            }
        }

        System.out.println(ans);
    }

    private static int dfs(int[][] nums, int i, int j) {
        if(i<0||j<0||i==nums.length||j==nums[0].length||nums[i][j]==1) return 0;

        nums[i][j] = 1;
        int ans = 1;
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};

        for (int k = 0; k < x.length; k++) {
            int nextI = i + x[k], nextJ = j + y[k];
            ans += dfs(nums, nextI, nextJ);
        }
        return ans;
    }


}
