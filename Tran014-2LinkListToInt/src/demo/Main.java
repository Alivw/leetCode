package demo;

/**
 * @Description: 二进制链表转换为整数
 * 给你一个单链表的引用结点head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * @Author: Awei
 * @Create: 2021-05-03 12:50
 **/
public class Main {
    public static void main(String[] args) {
        String num = "10010";
        ListNode head = new ListNode();
        ListNode list = head;
        for (int i = 0; i < num.length(); i++) {
            list.next = new ListNode((int) num.charAt(i) - 48);  // '1' ascii=49
            list = list.next;
        }
        System.out.println(getDecimalValue(head));


    }

    public static int getDecimalValue(ListNode head) {
        ListNode node = head;
        int re = 0;
        while (node != null) {
            re = re * 2 + node.val;
            node = node.next;
        }
        return re;
    }
}
