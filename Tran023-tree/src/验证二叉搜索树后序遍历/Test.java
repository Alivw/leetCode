package 验证二叉搜索树后序遍历;

public class Test {


    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder, 0, postorder.length - 1);
    }

    private boolean verifyPostorder(int[] postorder, int i, int j) {
        if (i >= j) return true;

        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;

        while (postorder[p] > postorder[j]) p++;

        return p == j && verifyPostorder(postorder, i, m - 1) && verifyPostorder(postorder, m, j - 1);
    }
}
