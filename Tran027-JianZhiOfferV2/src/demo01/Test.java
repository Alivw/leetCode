package demo01;

public class Test {
    public static void main(String[] args) {
        new Test().exchange(new int[]{1,11,14});
    }


    /**
     * 矩阵中的路径
     * 给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
     * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 深度优先搜索
     *
     * @param board  搜索的二维矩阵
     * @param worlds 是否存在的 target
     * @param i      开始
     * @param j      截止
     * @param k
     * @return
     */
    private boolean dfs(char[][] board, char[] worlds, int i, int j, int k) {
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != worlds[k]) {
            return false;
        }

        if(k==worlds.length-1) return true;
        board[i][j] = '\0';
        boolean ans = dfs(board, worlds, i, j + 1, k + 1) || dfs(board, worlds, i + 1, j, k + 1) ||
                dfs(board, worlds, i - 1, j, k + 1) || dfs(board, worlds, i, j - 1, k + 1);
        board[i][j] = worlds[k];
        return ans;
    }

    /**
     * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
     * @param nums
     * [1,2,3,4]
     * @return
     */
    public int[] exchange(int[] nums) {
        int i =0,j=nums.length-1;
        while (i<j){
            while (i<j&&(nums[i]&1)==1) i++;
            while (i<j&&(nums[j]&1)==0) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
        }
        return nums;
    }


}
