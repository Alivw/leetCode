package N叉树层次遍历;

import java.util.*;

/**
 * @Description N叉树层次遍历
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/30 09:42
 */
public class Main {

    public static void main(String[] args) {

        Node node = new Node(1, Arrays.asList(new Node[]{null, new Node(2, Arrays.asList(new Node[]{new Node(5), new Node(6)})), new Node(3), new Node(4), null}));
        List<List<Integer>> lists = new Main().levelOrder(node);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + "  ");
            }
            System.out.println();
        }

    }

    /**
     * 自己写的
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<List<Node>> queue = new LinkedList<>();
        queue.add(Arrays.asList(root));

        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            List<Node> levelArr = queue.remove();
            for (Node item : levelArr) {
                if (item != null) {
                    tempList.add(item.val);
                    if (item.children != null) {
                        queue.add(item.children);
                    }
                }
            }

            res.add(tempList);
        }

        return res;
    }

    /**
     * 官解
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder1(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            int size = queue.size();    // 秒
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                tempList.add(node.val);
                if(node.children!=null){
                    for(Node item :node.children){
                        queue.add(item);
                    }
                }
            }
            res.add(tempList);
        }

        return res;
    }
}



class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
