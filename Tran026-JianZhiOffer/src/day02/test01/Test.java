package day02.test01;

import java.util.Stack;

/**
 * @Description 从尾到头打印链表
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/2/5 20:42
 */
public class Test {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        new Test().reversePrint(head);
    }

    /**
     * my solution
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        int index = 0;
        ListNode curr =head;
        while (curr != null) {
            index++;
            curr = curr.next;
        }

        int[] ans = new int[index];
        //index = 0;
        curr = head;
        while (curr != null) {
            ans[--index] = curr.val;
            curr = curr.next;
        }
        return ans;
    }

    /**
     * use stack
     *
     * @param head
     * @return
     */
    public int[] reversePrint1(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        int index = 0;
        while (head != null) {
            stack.push(head);
            head = head.next;
            index++;
        }
        int[] ans = new int[index];

        index = 0;
        while (!stack.isEmpty()) {
            ans[index++] = stack.pop().val;
        }
        return ans;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x,ListNode next) {
        val = x;
        this.next = next;
    }
}

