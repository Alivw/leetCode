package 字符串的排列;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        String[] permutation = new Test().permutation("1233");
        for (String s : permutation) {
            System.out.println(s);
        }
    }

    public String[] permutation(String s) {
        Set<String> set = new HashSet<>();
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        dfs(set, chs, 0);
        return set.toArray(new String[set.size()]);
    }

    private void dfs(Set<String> set, char[] chs, int idx) {
        if (idx == chs.length) set.add(new String(chs));
        else
            for (int i = idx; i < chs.length; i++) {

                swap(chs, idx, i);
                dfs(set, chs, idx + 1);
                swap(chs, idx, i);
            }
    }

    private String[] permutationV1(String s) {
        List<String> list = new ArrayList<>();
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        dfsV1(list, chs, 0);
        return list.toArray(new String[list.size()]);
    }

    private void dfsV1(List<String> list, char[] chs, int idx) {
        if (idx == chs.length) list.add(new String(chs));
        else
            for (int i = idx; i < chs.length; i++) {
                swap(chs, i, idx);

                dfsV1(list, chs, idx + 1);
                swap(chs, i, idx);

            }

    }

    private void swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }


    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);


        return Arrays.copyOf(arr, k);
    }
}
