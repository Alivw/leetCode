/**
 * @Description: 给你两个链表list1 和list2，它们包含的元素分别为n个和m个。
 * 请你将list1中第a个节点到第b个节点删除，并将list2接在被删除节点的位置。
 * @Author: Awei
 * @Create: 2021-04-17 14:14
 **/
public class Main {
    public static void main(String[] args) {

    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        getIndexNode(list1, a).next = list2;
        return list1;
    }

    public ListNode getIndexNode(ListNode list, int index) {
        int i = 0;
        while (i <= index) {
            list = list.next;
            i++;
        }
        return list;
    }

}

