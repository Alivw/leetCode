package 有效数的完全平方;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
        int left =0,right =num,mid;
        while (left<=right){
            mid = left + (right - left >> 1);
            long temp =(long) mid * mid;
            if(temp==num) return true;

            if(temp<num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
