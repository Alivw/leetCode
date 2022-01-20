package 图;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 11:21
 */
public class Main {

    /**
     * 1->2->4->6
     * 1->2->5->6
     * 1->3->2
     * 1->3->5
     * 深度优先遍历：1->2->4->6->5->3
     *             A->B->D->F->E->C
     * 广度优先遍历：1->2->3->4->5->6
     */

    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D", "E", "F"};
        Graph<String> g = new UndirectedGraph<>(str.length);
        g.initVertexes(str);
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("B", "C");
        g.addEdge("B", "E");
        g.addEdge("C", "E");
        g.addEdge("D", "F");
        g.addEdge("E", "F");
        g.printEdges();
        System.out.println("深度优先遍历：");
        g.DFS();
        System.out.println("\n======================");

        Graph<String> g1 = new DirectGraph<>(str.length);
        g1.initVertexes(str);
        g1.addEdge("A", "B");
        g1.addEdge("A", "C");
        g1.addEdge("C", "B");
        g1.addEdge("B", "D");
        g1.addEdge("B", "E");
        g1.addEdge("C", "E");
        g1.addEdge("E", "F");
        g1.addEdge("D", "F");
        g1.printEdges();

        g1.DFS();

    }
}
