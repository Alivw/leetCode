package doublelinklist;

/**
 * @Description DoubleLinkedList
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/19 10:09
 */
public class JalivvLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int len;

    public JalivvLinkedList() {
        this.head = new Node<>();
        this.tail = new Node<>();
        this.len = 0;
    }

    public JalivvLinkedList(T[] arr) {
        head = new Node<>();
        Node curr = head;
        for (T t : arr) {
            Node node = new Node(t);
            curr.next = node;
            node.pre = curr;
            curr = node;
        }
        this.tail = curr;
        curr.next = null;
        this.len = arr.length;
    }

    public void printList() {
        StringBuilder bd = new StringBuilder();
        bd.append("[");
        Node curr = head;
        curr = curr.next;
        if (curr == null) {
            bd.append("]");
        }
        else {
            while (curr != null) {
                bd.append(curr.data + "-->");
                curr = curr.next;
            }
            bd = new StringBuilder(bd.substring(0, bd.length() - 3));
            bd.append("]");
        }

        System.out.println(bd);
    }

    public void printList(Node target) {
        if (contains(target)) {

        }
        else {
            System.out.println("输出的开始节点不存在！");
        }
    }

    public boolean contains(Node target) {
        Node curr = head;
        curr = curr.next;
        while (curr != null) {
            if (curr.data.equals(target.data)) {
                return true;
            }
            else {
                curr = curr.next;
            }
        }
        return false;

    }
}
