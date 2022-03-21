package 顺时针打印矩阵;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
    }


    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int[] order = new int[total];
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }


    /**
     * 数组中数字出现的次数
     *
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {

        Arrays.sort(nums);
        int[] ans = new int[2];

        //////////////////////////////
        int idx = 0;
        while (idx < nums.length && (nums[idx] ^ nums[idx + 1]) == 0) {
            idx += 2;
        }


        /////////////////////////////
        ans[0] = nums[idx];
        idx++;
        while (idx < nums.length - 1 && (nums[idx] ^ nums[idx + 1]) == 0) {
            idx += 2;
        }
        ans[1] = nums[idx];
        return ans;
    }
}
