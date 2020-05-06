package array_string.doublePointer;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其 和 ≥ s  的长度最小的连续子数组，
 * 并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 **/
public class MinLenSubArray {

    public static void main(String[] args) {
        int[] arr = {1,4,4};
        int target = 4;
        System.out.println(window(target,arr));
    }

    /**
     * 滑动窗口
     */
    private static int window(int s,int[] nums){
        int l = 0;
        int r = 0;
        int len = nums.length;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (r < len){
            //当sum < s 扩大 r
            //当sum >= s 更新res 缩小l
            sum += nums[r];
            while (sum >= s && l <= r){
                res = Math.min(res,r-l+1);
                sum-=nums[l++];
            }
            r++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }

    /**
     * 迭代解法
     */
    private static void min(int[] arr,int target){
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum>=target) {
                res = Math.min(res,1);
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                sum+=arr[j];
                if(sum>=target){
                    res = Math.min(res,j-i+1);
                    break;
                }
            }
        }
        res = res==Integer.MAX_VALUE?0:res;
        System.out.println(res);
    }
}
