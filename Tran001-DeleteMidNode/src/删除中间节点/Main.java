package 删除中间节点;

/**
 * @Description:实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 * @Author: Awei
 * @Create: 2021-04-12 08:05
 **/

public class Main {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
