package p74.搜索二维矩阵;

public class Main {
    public static void main(String[] args) {
        // searchMatrix1(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        System.out.println(searchMatrix1(new int[][]{{1, 3}}, 3));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1, mid = 0;
        while (left <= right) {
            mid = left + (right - left >> 1);
            int x = matrix[mid / n][mid % n];
            if (x == target) return true;


            if (x > target) right = mid - 1;
            else left = mid + 1;

        }
        return false;
    }

    /**
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int idx = searchMatrixRow(matrix, target);
        System.out.println(idx);
        int left = 0, right = matrix[idx].length - 1, mid;
        while (left <= right) {
            mid = left + (right - left >> 1);
            if (matrix[idx][mid] == target) return true;

            if (target > matrix[idx][mid]) left = mid+1;
            else right = mid -1;

        }
        return false;
    }

    private static int searchMatrixRow(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left >> 1);

            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {
                return mid;
            }

            if (matrix[mid][0] > target) right = mid - 1;
            else left = mid + 1;


        }
        return -1;
    }
}
