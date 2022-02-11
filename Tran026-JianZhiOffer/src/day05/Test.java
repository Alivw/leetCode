package day05;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        //System.out.println(new Test().minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(new Test().firstUniqChar("abaccdeff"));
    }


    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            int num = matrix[row][col];
            if (target == num) {
                return true;
            }

            if (num > target) {
                col--;
            }else
                row++;
        }

        return false;
    }


    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     *
     * 给你一个可能存在重复元素值的数组numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。
     * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int mid = i + ((j - i) >> 1);
            if (numbers[mid] > numbers[j]) {
                i = mid + 1;
            } else if (numbers[mid] < numbers[j]) {
                j = mid;
            } else j--;
        }

        return numbers[i];
    }


    /**
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     *
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        int length = s.length();
        if (length == 0) {
            return ' ';
        }
        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char ch : chars)
            map.put(ch, !map.containsKey(ch));
        for (Map.Entry<Character, Boolean> entry : map.entrySet())
            if (entry.getValue()) return entry.getKey();
        return ' ';


    }

}
