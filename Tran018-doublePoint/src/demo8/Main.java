package demo8;


/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-14 09:22
 **/
public class Main {
    public static void main(String[] args) {

    }

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

}
