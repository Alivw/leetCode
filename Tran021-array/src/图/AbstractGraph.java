package 图;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 17:02
 */
public abstract class AbstractGraph<T> implements Graph<T> {



    //存储所有顶点信息的一维数组
    T[] vertexesArray;

    // 记录第i个节点是否被访问过
    boolean[] visited;

    //存储图中顶点之间关联关系的二维数组,及边的关系
    int[][] edges;

    // 图顶点个数
    int vertexSize;

    public AbstractGraph(int n) {
        this.vertexesArray = (T[]) new Object[n];
        this.vertexSize = n;
        this.visited = new boolean[n];
        // 初始化各个节点的访问状态
        for (int i = 0; i < this.visited.length; i++) {
            this.visited[i] = false;
        }
        this.edges = new int[n][n];
    }

}
