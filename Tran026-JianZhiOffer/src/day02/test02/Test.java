package day02.test02;


import day02.ListNode;

/**
 * @Description 反转链表
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/2/5 20:56
 */
public class Test {
    public static void main(String[] args) {


    }

    /**
     * 迭代法
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
