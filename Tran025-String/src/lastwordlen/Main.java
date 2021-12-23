package lastwordlen;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/23 10:14
 */
public class Main {


    public int lengthOfLastWord(String s) {
        String t =s.trim();
        int len =t.length();
        int cnt=0,index=len-1;
        boolean flag=false;
        while(index>=0&&t.charAt(index--)!=' '){
            cnt++;
        }
        return cnt;
    }

}
