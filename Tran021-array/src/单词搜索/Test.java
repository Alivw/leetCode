package 单词搜索;

public class Test {
    public static void main(String[] args) {
        //board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, word = "ABCCED"

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(new Test().exist(board, "ABCCEDA"));
    }


    public boolean exist(char[][] board, String word) {
        int b = board.length, w = board[0].length;
        boolean[][] visited = new boolean[b][w];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < w; j++) {
                if (exist(board, visited, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, boolean[][] visited, int i, int j, String word, int k) {
        if (board[i][j] != word.charAt(k)) return false;
        else if (k == word.length() - 1) return true;

        visited[i][j] = true;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] dir : directions) {
            int ii = i + dir[0], jj = j + dir[1];
            if (ii >= 0 && jj >= 0 && ii < board.length && jj < board[0].length
                    && !visited[ii][jj]
                    && exist(board, visited, ii, jj, word, k + 1)
            )
                return true;
        }
        return false;
    }

}
