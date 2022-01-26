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
    }

    private int minDepthBFS(TreeNode root, Queue<TreeNode> queue, int minDepth ) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            queue.add(root.left);
        }
        if (root.left != null) {
            queue.add(root.right);
        }
        minDepth=1;
        TreeNode node = new TreeNode();
        while ( (node = queue.remove() )!= null) {
            if (node.left == null && node.right == null) {
                return minDepth;
            }

        }
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
