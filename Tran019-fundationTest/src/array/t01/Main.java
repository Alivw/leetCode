package array.t01;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-11 17:08
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "mississippi"));
    }




    public static int strStr(String haystack, String needle) {
        int m =haystack.length(),n=needle.length();
        for (int i = 0; i+n<=m; i++) {
            boolean flag=true;
            for (int j =0; j < n; j++) {
                if (haystack.charAt(i) != needle.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
