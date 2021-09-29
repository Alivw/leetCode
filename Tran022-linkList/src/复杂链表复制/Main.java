package 复杂链表复制;

import java.util.HashMap;
import java.util.Map;

/**
 * 请实现 copyRandomList 函数，复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * @Author: shizuwei
 * @Create: 2021-09-29 10:40
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().reverseLeftWords("abcdefg", 2));
    }

    /** 
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     * @param: s
     * @param n 
     * @return java.lang.String 
     * @author Shi Zuwei on 2021/9/29 10:55 
     */ 
    public String reverseLeftWords(String s, int n) {
        return s.substring(n%s.length())+s.substring(0,n%s.length());
    }

    /**
     * 复制复杂链表
     * @param: head
     * @return 复杂链表复制.Node
     * @author Shi Zuwei on 2021/9/29 10:56
     */
    public Node copyRandomList(Node head) {
        if (null == head) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (null != cur) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (null != cur) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
