package 错误的版本;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-17 18:34
 **/
public class ErrMain {
    public static void main(String[] args) {

    }
    public static int firstBadVersion(int n) {
        int mid = 0, low = 0, high = n;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    private static boolean isBadVersion(int mid) {
        return false;
    }
}
