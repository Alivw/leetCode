package reverseLinkList;

public class Test {


    public static void main(String[] args) {

    }

    private ListNode reverseListNode(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode node = reverseListNode(head.next);
        head.next.next=head;
        head.next = null;
        return node;
    }
}



class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
