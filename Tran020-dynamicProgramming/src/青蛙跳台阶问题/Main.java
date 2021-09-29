package 青蛙跳台阶问题;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-29 14:33
 **/
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 0; i < 40; i++) {
            System.out.print(main.numWays(i)+" ");
        }

    }

    /**
     * 青蛙跳台阶
     * @param: n
     * @return int
     * @author Shi Zuwei on 2021/9/29 14:57
     */
    public int numWays(int n) {
        if(n<3) return n==0?1:n;
        int start =1,end=2;
        for(int i =3;i<=n;i++){
            int temp =end;
            end=start+end;
            start=temp;
        }
        return end;
    }
}
