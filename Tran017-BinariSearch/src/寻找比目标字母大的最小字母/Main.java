package 寻找比目标字母大的最小字母;

public class Main {

    /*
        给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母target
        请你寻找在这一有序列表里比目标字母大的最小字母。
        在比较时，字母是依序循环出现的。举个例子：
        如果目标字母 target = 'z' 并且字符列表为letters = ['a', 'b']，则答案返回'a'
        示例 1：
        输入: letters = ["c", "f", "j"]，target = "a"
        输出: "c"
        示例 2:
        输入: letters = ["c","f","j"], target = "c"
        输出: "f"
        示例 3:
        输入: letters = ["c","f","j"], target = "d"
        输出: "f"
     */

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'e','e','e','e','e','e','n','n','n','n',}, 'e'));
        arrangeCoins(1);
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        int left= 0,right =letters.length-1,mid;
        if(letters[right]<=target) return letters[0];
        while(left<right){
            mid= left+(right-left>>1);

            //  .... target .. mid ..
            if(target<letters[mid]) right=mid;
            else
                //  . . . mid ... target
                left = mid + 1;

        }
        return letters[left];
    }


    public static int arrangeCoins(int n) {
        int cnt=0;
        for(int i =1;i<=n;i++){
            if((n-=i)>=0)
                cnt++;
            else
                break;
        }
        return cnt;
    }


}
