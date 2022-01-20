package doublelinklist;

/**
 * @Description Node
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/19 10:09
 */
public class Node<T> {

    Node pre;
    Node next;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }
}
