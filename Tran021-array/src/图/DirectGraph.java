package 图;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 有向图
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/20 17:01
 */
public class DirectGraph<T> extends AbstractGraph<T> {

    /**
     * 调用父类的构造方法
     * @param n
     */
    public DirectGraph(int n) {
        super(n);
    }


    @Override
    public String getGraphType() {
        return "有向联通图";
    }

    @Override
    public void addEdge(T a, T b) {
        int aIndex = -1, bIndex = -1;
        for (int i = 0; i < this.vertexSize; i++) {
            if (vertexesArray.get(i).equals(a)) {
                aIndex = i;
            }
            if (vertexesArray.get(i).equals(b)) {
                bIndex = i;
            }
        }
        this.edges[aIndex][bIndex] = 1;
    }

    @Override
    public void printEdges() {
        for (int i = 0; i < this.vertexSize; i++) {
            for (int j = 0; j < this.vertexSize; j++) {
                System.out.print(this.edges[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public void DFS() {
        for (int i = 0; i < vertexSize; i++) {
            visited[i] = false;
        }
        DFS(0);
    }

    private void DFS(int i) {
        this.visited[i] = true;
        System.out.print(vertexesArray.get(i)+" ");
        int j = firstAdjVex(i);
        while (j != -1) {
            DFS(j);
            j = firstAdjVex(i);
        }
    }

    /**
     * 与该顶点有边的下一个顶点
     *
     * @param row
     * @return
     */
    private int firstAdjVex(int row) {
        for (int i = 0; i < this.vertexSize; i++) {
            if (this.edges[row][i] == 1 && !this.visited[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 广度优先遍历算法 Breadth-first search（非递归）
     */
    @Override
    public void BFS() {
        // LinkedList实现了Queue接口 FIFO
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertexSize; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < this.vertexSize; i++) {
            // 该顶点未被访问
            if (!this.visited[i]) {
                queue.add(i);
                visited[i] = true;
                System.out.print(vertexesArray.get(i)+" ");
                while (!queue.isEmpty()) {
                    int row = queue.remove();
                    int j = firstAdjVex(row);
                    while (j != -1) {
                        queue.add(j);
                        visited[j] = true;
                        System.out.print(vertexesArray.get(j)+" ");
                        j = firstAdjVex(row);
                    }
                }

            }
        }
    }

}
