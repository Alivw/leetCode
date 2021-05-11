/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-05-11 23:16
 **/
public class Main {
    public static void main(String[] args) {

    }


    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else{
            int a =maxDepth(root.left);
            int b =maxDepth(root.right);
            return a>b? (a+1):(b+1);
        }
    }
}




