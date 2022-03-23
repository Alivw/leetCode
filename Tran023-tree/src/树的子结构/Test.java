package 树的子结构;

public class Test {


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean recur(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if (a == null || a.val != b.val) return false;
        return recur(a.left, b.left) && recur(a.right, b.right);
    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

