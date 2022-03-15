package demo8;


import java.util.List;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-14 09:22
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        ListNode head = new ListNode();
        ListNode list = head;

        /**
         * 尾插法
         */
//        for (int i = 0; i < arr.length; i++) {
//            list.next = new ListNode(arr[i]);
//            list = list.next;
//        }
        /**
         * 头插法
         */
        ListNode tempNode;
        for (int i=arr.length-1;i>=0;i--) {
            tempNode = new ListNode(arr[i]);
            tempNode.next = head.next;
            head.next = tempNode;
        }


        ListNode node = new Main().reverseList(head.next);
        while (null != node) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println("\n"+new Main().fun(arr, 2, 3));

    }

    /**
     * 快慢指针
     *
     * @param n
     * @return demo8.ListNode
     * @param: head
     * @author Shi Zuwei on 2021/9/15 15:32
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode ans = new ListNode(0, head);
        ListNode low = ans;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            low = low.next;
        }
        low.next = low.next.next;
        return ans.next;
    }


    /**
     * 翻转链表
     *
     * @return demo8.ListNode
     * @param: head
     * @author Shi Zuwei on 2021/9/15 15:35
     */
    ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newList = reverseList(head.next);
        ListNode t1 = head.next;
        t1.next = head;
        head.next = null;
        return newList;
    }


    /**
     * 秦润面试题
     * @param: arr
     * @param i
     * @param n
     * @return int
     * @author Shi Zuwei on 2021/9/15 17:26
     */
    public int fun(int arr[], int i, int n) {
        if (i == n - 1) {
            return arr[i];
        }else{
            int temp = fun(arr, i + 1, n);
            return arr[i] > temp ? arr[i] : temp;
        }
    }


    /**
     * 输出倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode n =head;
        int len = 0;
        while (n != null) {
            len++;
            n = n.next;
        }
        int idx = len - k ;
        n=head;
        while (idx-- > 0) {
            n = n.next;
        }
        return n;
    }
}
