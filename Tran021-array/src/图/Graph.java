package 图;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 16:57
 */
public interface Graph<T> {

    /**
     * 初始化顶点
     *
     * @param arr
     */
    void initVertexes(T[] arr);

    /**
     * 添加边的信息
     *
     * @param a
     * @param b
     */
    void addEdge(T a, T b);


    /**
     * 输出图的临接矩阵
     */
    void printEdges();

    /**
     * 深度优先搜索DFS（depth-first search）遍历
     */
    void DFS();


}
