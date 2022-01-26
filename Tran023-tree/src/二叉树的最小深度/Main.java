package 二叉树的最小深度;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 二叉树的最小深度
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/26 21:31
 */
public class Main {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6, null, null)))));
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, null));
        System.out.println(new Main().minDepthBFS(root1));
    }

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left)+1,minDepth(root.right)+1);
    }

    /**
     * 基于广度优先搜索获取二叉树的最小深度
     * @param root
     * @return
     */
    public int minDepthBFS(TreeNode root) {
        return minDepthBFS(root, new LinkedList<>());
    }

    private int minDepthBFS(TreeNode root, Queue<TreeNode> queue) {
        if (root == null) {
            return 0;
        }
        int index = 0;      // 树的第几层
        if (root.left != null) {
            index++;
            queue.add(root.left);
        }
        if (root.right != null) {
            index++;
            queue.add(root.right);
        }
        TreeNode node = null;
        int minDepth = 1;
        while (!queue.isEmpty()) {

            while (index != 0&&!queue.isEmpty()) {
                node = queue.remove();
                if (node.left == null && node.right == null) {
                    return minDepth + 1;
                }
                if (node!=null&& node.left != null) {

                    queue.add(node.left);
                }
                if (node!=null&&node.right != null) {
                    queue.add(node.right);
                }
                index--;
            }

            if (node!=null&& node.left != null) {

                index++;
            }
            if (node!=null&&node.right != null) {

                index++;
            }
            minDepth++;

        }
        return minDepth;
    }
}


  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
