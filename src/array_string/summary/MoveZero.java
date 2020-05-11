package array_string.summary;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 **/
public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0,0,1};
        test(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 解决不了{0,0,1};
     * @param nums
     */
    private static void test(int[] nums){
        //没趟移动一个0
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]==0){
                for (int j = i+1; j < nums.length-n && j > 0; j++) {
                    swap(nums,j-1,j);
                }
                n++;
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
