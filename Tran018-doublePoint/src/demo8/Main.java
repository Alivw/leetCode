package demo8;


import java.util.HashMap;

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
        for (int i = 0; i < arr.length; i++) {
            list.next = new ListNode(arr[i]);
            list = list.next;
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
}
