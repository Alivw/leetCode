package 图;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 11:21
 */
public class Main {


    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D", "E", "F"};
        Graph<String> g = new Graph<>(str.length);
        g.addVertexes(str);
        g.addEdge("A","B");
        g.addEdge("A","C");
        g.addEdge("B","D");
        g.addEdge("B","C");
        g.addEdge("B","E");
        g.addEdge("C","E");
        g.addEdge("D","F");
        g.addEdge("E","F");
        g.printEdges();

        g.DFS();
    }
}
