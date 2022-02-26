package doublelinklist;

/**
 * @Description psvm
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/19 10:13
 */
public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        JalivvLinkedList<Integer> jlist = new JalivvLinkedList<>(arr);

        System.out.println(jlist.len);

        jlist.printList();

        for (int i = 0; i < 10; i++) {
            System.out.println(jlist.contains(new Node(i)));
        }

        new Main().deleteNode(new ListNode(3, new ListNode(1, new ListNode(5, new ListNode(9, null)))), 9);
    }


    /**
     * 删除链表中的元素
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        if (node.val == val) {
            return head.next;
        }


        while (node.next != null && node.next.val != val) {
            node = node.next;
        }
        if (node.next != null) {
            node.next = node.next.next;
        }



        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
