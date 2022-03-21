package 岛屿最大面积;

import com.oracle.webservices.internal.api.databinding.DatabindingModeFeature;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @Description 岛屿最大的面积
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/29 10:46
 */
public class Main {


    /**
     * 给你一个大小为 m x n 的二进制矩阵 grid 。
     * 岛屿是由一些相邻的1(代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设grid 的四个边缘都被 0（代表水）包围着。
     * 岛屿的面积是岛上值为 1 的单元格的数目。
     * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
     *
     * @param args
     */
    public static void main(String[] args) {

        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.println(new Main().maxAreaOfIsland(grid));

    }


    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans = Math.max(ans, dfs(grid, i, j));
            }
        }

        return ans;
    }

    /**
     * 深度优先获取 indexI indexJ 周围的最大的面积
     *
     * @param grid
     * @param indexI
     * @param indexJ
     * @return
     */
    private int dfs(int[][] grid, int indexI, int indexJ) {
        if (indexI < 0 || indexJ < 0 || indexI == grid.length || indexJ == grid[0].length || grid[indexI][indexJ] != 1)
            return 0;
        grid[indexI][indexJ] = 0;
        int ans = 1;
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            ans += dfs(grid, indexI + x[i], indexJ + y[i]);
        }

        return ans;
    }


}
