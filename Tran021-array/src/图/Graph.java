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
     * 获取图对类型
     * @return
     */
    String getGraphType();

    /**
     * 获取顶点数量
     * @return
     */
    int getVexNum();

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


    /**
     * 广度优先遍历算法 Breadth-first search（非递归）
     */
    void BFS();

    /**
     * 获取图中边的数量
     * @return
     */
    int getEdgeNum();

    /**
     * 向图中添加一个顶点
     * @param t
     */
    void insert(T t);


}
