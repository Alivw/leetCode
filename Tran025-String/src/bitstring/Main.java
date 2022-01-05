package bitstring;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/23 10:47
 */
public class Main {


    public static void main(String[] args) {


        System.out.println(new Main().addBinary("110010", "100"));
    }

    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     * <p>
     * 输入为 非空 字符串且只包含数字 1 和 0。
     *
     * @param a         111010
     * @param b         010111
     * @return         1010001
     */
    public String addBinary(String a, String b) {
        // 最小长度
        int aIndex = a.length() - 1, bIndex = b.length() - 1;
        int minLen = Math.min(a.length(), b.length());
        int carry = 0;  // 进位标志

        // 最大长度+1
        char[] arr = new char[Math.max(a.length(), b.length()) + 1];

        int arrlen = arr.length;
        while (--minLen >= 0) {
            arr[--arrlen] = charBitSum(a.charAt(aIndex), b.charAt(bIndex), carry);
            carry = charBitCarry(a.charAt(aIndex--), b.charAt(bIndex--), carry);
        }


        String maxStr = a.length() > b.length() ? a : b;
        int lastIndex = a.length() > b.length() ? aIndex : bIndex;

        int count = a.length() > b.length() ? a.length() - b.length() : b.length() - a.length();


        while (--count >= 0) {          // 循环次数
            arr[--arrlen] = charBitSum(maxStr.charAt(lastIndex),'0', carry);
            carry = charBitCarry(maxStr.charAt(lastIndex),'0', carry);
            lastIndex--;

        }

        if (carry == 1) {
            arr[0] = (char) (carry+48);
          return   String.valueOf(arr);
        }else{
            return String.valueOf(arr).substring(1);
        }

    }

    /**
     * 两个字符相加求进位
     * @param ch1
     * @param ch2
     * @param carry
     * @return
     */
    private int charBitCarry(char ch1, char ch2, int carry) {
        int i1 = ch1 - 48, i2 = ch2 - 48;

        return (i1 + i2 + carry) / 2 == 1 ? 1 : 0;
    }

    /**
     * 两个字符相加求余位
     * @param ch1
     * @param ch2
     * @param carry
     * @return
     */
    private char charBitSum(char ch1, char ch2, int carry) {

        int i1 = ch1 - 48, i2 = ch2 - 48;

        return (i1 + i2 + carry) % 2 == 1 ? '1' : '0';

    }

}
