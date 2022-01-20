package 图;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 10:54
 */
public class Graph<T> {


    //存储所有顶点信息的一维数组
    private T[] vertexesArray;

    // 记录第i个节点是否被访问过
    private boolean[] visited;

    //存储图中顶点之间关联关系的二维数组,及边的关系
    private int[][] edges;

    private int vertexSize;

    public Graph(int n) {
        this.vertexesArray = (T[]) new Object[n];
        this.vertexSize = n;
        this.visited = new boolean[n];
        // 初始化各个节点的访问状态
        for (int i = 0; i < this.visited.length; i++) {
            this.visited[i] = false;
        }
        this.edges = new int[n][n];
    }

    /**
     * 初始化顶点
     * @param arr
     */
    public void addVertexes(T[] arr) {
        this.vertexesArray = arr;
    }

    public void addEdge(T a, T b) {
        int aIndex = -1, bIndex = -1;
        for (int i = 0; i < vertexesArray.length; i++) {
            if (vertexesArray[i].equals(a)) {
                aIndex = i;
            }
            if (vertexesArray[i].equals(b)) {
                bIndex = i;
            }
        }
        this.edges[aIndex][bIndex] = 1;
        this.edges[bIndex][aIndex] = 1;
    }

    /**
     * 输入图的临接矩阵
     */
    public void printEdges() {
        for (int i = 0; i < this.edges.length; i++) {
            for (int j = 0; j < this.edges[i].length; j++) {
                System.out.print(this.edges[i][j] + " ");
            }
            System.out.println();
        }
    }



    /**
     * 深度优先搜索DFS（depth-first search），递归
     */
    public void DFS() {
        //这里是从第一上添加的顶点开始搜索
        DFS(0);
    }

    private void DFS(int i) {
        visited[i] = true;
        System.out.print(vertexesArray[i] + " ");
        int j = firstAdjVex(i);
        while (j != -1) {
            DFS(j);
            j = firstAdjVex(i);
        }
    }


    /**
     * 与该节点有边的下一个顶点
     * @param row
     * @return
     */
    private int firstAdjVex(int row) {
        for (int column = 0; column < vertexesArray.length; column++) {
            if (this.edges[row][column] == 1&&!visited[column])
                return column;
        }
        return -1;
    }

}
