package day03;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/2/7 19:16
 */
public class Test {
    /**
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
     * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        StringBuilder bd =new StringBuilder();
        String pre= s.substring(0,n);
        String tail =s.substring(n,s.length());
        return bd.append(tail).append(pre).toString();

    }


    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        StringBuilder bd =new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(' '==s.charAt(i)){
                bd.append("%20");
            }else{
                bd.append(s.charAt(i));
            }
        }
        return bd.toString();
    }

}
