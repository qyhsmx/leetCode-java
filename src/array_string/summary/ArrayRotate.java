package array_string.summary;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 **/
public class ArrayRotate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        test(nums,k);
    }

    /**
     * 暴力解法
     * 1 2 3 4 5 6 7
     * 向右旋转 3
     * 5 6 7 1 2 3 4
     */
    private static void test1(int[] nums,int k){
        for (int i = 0; i < k; i++) {
            int previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                int tmp = nums[j];
                nums[j] = previous;
                previous = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 额外数组
     * 新数组位置 i+k % len
     */
    private static void test2(int[] nums,int k){
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[(i+k)%len] = nums[i];
        }
        System.out.println(Arrays.toString(arr));

    }
    /**
     * 二级反转
     * 新数组位置 i+k % len
     */
    private static void test(int[] nums,int k){
        int len = nums.length;
        k %= len;
        // reverse the whole array
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums,int l,int r){
        while (l < r){
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }

    /**
     * 使用环状替换
     */
    private static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

}
