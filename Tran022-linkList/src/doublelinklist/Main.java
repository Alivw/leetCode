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
    }
}
