package 图;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 17:02
 */
public abstract class AbstractGraph<T> implements Graph<T> {


    //存储所有顶点信息的一维数组
    List<T> vertexesArray;

    // 记录第i个节点是否被访问过
    boolean[] visited;

    //存储图中顶点之间关联关系的二维数组,及边的关系
    int[][] edges;

    // 图顶点个数
    int vertexSize;



    /**
     * 初始化顶点
     *
     * @param arr
     */
    @Override
    public void initVertexes(T[] arr) {
        for (T t : arr) {
            vertexesArray.add(t);
        }
    }

    public AbstractGraph(int n) {
        this.vertexesArray = new ArrayList<>();
        this.vertexSize = n;
        this.visited = new boolean[n];
        // 初始化各个节点的访问状态
        for (int i = 0; i < this.visited.length; i++) {
            this.visited[i] = false;
        }
        this.edges = new int[n][n];
    }

    @Override
    public int getVexNum() {
        return vertexSize;
    }

    @Override
    public int getEdgeNum() {
        int cnt = 0;
        for (int i = 0; i < vertexSize; i++) {
            for (int j = 0; j < vertexSize; j++) {
                if (edges[i][j] == 1) {
                    cnt++;
                }
            }
        }
        return cnt / 2;
    }


    @Override
    public void insert(T t) {
        vertexesArray.add(t);
    }

}
