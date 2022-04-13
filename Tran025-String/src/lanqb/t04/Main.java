package lanqb.t04;

import java.util.Arrays;

/**
 * 小蓝老师教的编程课有 N 名学生，编号依次是 1 . . . N。第 i 号学生这学期
 * 刷题的数量是 Ai。
 * 对于每一名学生，请你计算他至少还要再刷多少道题，才能使得全班刷题
 * 比他多的学生数不超过刷题比他少的学生数。
 * 【输入格式】
 * 第一行包含一个正整数 N。
 * 第二行包含 N 个整数：A1, A2, A3, . . . , AN.
 * 【输出格式】
 * 输出 N 个整数，依次表示第 1 . . . N 号学生分别至少还要再刷多少道题。
 * 【样例输入】
 * 5
 * 12 10 15 20 6
 * 【样例输出】
 * 0 3 0 0 7
 */
public class Main {
    public static void main(String[] args) {
        int N = 6;
        int[] ints = {12, 10, 15, 20, 6, 8};
        int[] shuati = shuati(N, ints);
        for (int i : shuati) {
            System.out.print(i + " ");
        }
        System.out.println();
        shuati1(N, ints);
    }

    /**
     * 比他多的学生数不超过刷题比他少的学生数 duo <= shao
     *
     * @param n    有多少人
     * @param pros 每个人刷的题目数
     * @return
     */
    public static int[] shuati(int n, int[] pros) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {

            // 找到比他 刷题更多的 学生数量
            //找到比他 刷题少的 学生数量
            int duo = 0, shao = 0;
            for (int j = 0; j < n; j++) {
                if (pros[j] > pros[i]) {
                    duo++;
                }

                if (pros[j] < pros[i]) {
                    shao++;
                }
            }

            if (duo <= shao) {
                ans[i] = 0;
            } else {
                int offset = (duo - shao) % 2 == 0 ? (duo - shao) / 2 : (duo - shao) / 2 + 1;
                int[] temps = Arrays.copyOf(pros, pros.length);
                Arrays.sort(temps);
                int idx = 0;
                for (; idx < n; idx++) {
                    if (pros[i] == temps[idx]) {
                        break;
                    }
                }
                ans[i] = temps[idx + offset] + 1 - pros[i];
            }


        }
        return ans;
    }

    public static void shuati1(int n, int[] pros) {
        int[] find = Arrays.copyOf(pros, pros.length);
        Arrays.sort(find);

        for (int i = 0; i < n; i++) {
            int pos = Arrays.binarySearch(find, pros[i]);
            int less = pos;
            int more = n - pos - 1;
            if (more > less) {
                int offset = (more - less) % 2 == 0 ? (more - less) / 2 : (more - less) / 2 + 1;
                int num = find[pos + offset] - find[pos] + 1;
                System.out.print(num + " ");
            } else
                System.out.print(0 + " ");
        }
    }
}
