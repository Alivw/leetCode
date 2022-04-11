package t;

import java.lang.annotation.Retention;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // System.out.println(guessNumber(2));
        System.out.println(thirdMax(new int[]{1,-2147483648,2}));
    }

    public static int guessNumber(int n) {
        int left =1,right=n;
        while(left<=right){
            int mid =left+(right-left>>2);
            if(2<mid)
                right=mid;
            else if(2>mid)
                left=mid+1;
            else return mid;
        }
        return 1;
    }

    public static int thirdMax(int[] nums) {
        int third=Integer.MAX_VALUE;
        sort(nums);
        int cnt=0;
        for(int n :nums){
            if(n<third){
                third=n;
                cnt++;
                if(cnt ==3){
                    return third;
                }
            }

        }

        return nums[0];
    }

    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length-i-1 ; j++) {
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
        }
    }
}
