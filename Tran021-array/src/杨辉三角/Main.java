package 杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 杨辉三角递归生成
 * @Author jalivv
 * @Date 2021/12/21 20:52
 */
public class Main {

    public static void main(String[] args) {
        List<List<Integer>> generate = new Main().generate(5);

        for (List<Integer> list : generate) {

            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    /**
     * 生成 n 行的杨辉三角
     *
     * @param n
     * @return
     */
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        generate(n, res);
        return res;
    }

    /**
     * 生成第n 行的 数
     * @param n
     * @param res
     * @return
     */
    private List<Integer> generate(int n, List<List<Integer>> res) {
        if (n == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            res.add(row);
            return row;
        }

        List<Integer> preRow = generate(n - 1, res);
        List<Integer> row = new ArrayList<>();
        if (preRow.size() == 1) {
            row.add(1);
            row.add(2);
            row.add(1);
            res.add(row);
            return row;

        }

        row.add(1);
        for (int i = 0; i < preRow.size()-1; i++) {
            row.add(preRow.get(i) + preRow.get(i + 1));
        }
        row.add(1);
        res.add(row);
        return row;
    }
}
