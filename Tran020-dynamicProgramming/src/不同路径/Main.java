package 不同路径;

import com.sun.webkit.dom.NamedNodeMapImpl;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-15 15:19
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().uniquePaths(3, 7));
    }


    /**
     * 一个机器人位于一个 m x n网格的左上角 （起始点在下图中标记为 “Start” ）。
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
     * 问总共有多少条不同的路径？
     *
     * @param n
     * @return int
     * @param: m
     * @author Shi Zuwei on 2021/9/15 15:19
     */
    public int uniquePaths(int m, int n) {

//        if (m == 1 && n == 1) {
//            return 1;
//        }
//        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];

    }
}
