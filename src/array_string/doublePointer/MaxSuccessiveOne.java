package array_string.doublePointer;

/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 **/
public class MaxSuccessiveOne {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1};
        System.out.println(max_2(arr));
    }
    
    private static int max(int[] arr){
        if(arr.length==1 && arr[0]==0)return 0;
        int i = 0;
        int max = 0;
        while (i < arr.length){
            if(arr[i] == 1){
                int j = 1;
                while (i+j < arr.length && arr[i+j]==arr[i])
                    j++;
                max = Integer.max(max,j);
                i = i+j;
            }else {
                i++;
            }
        }
        return max;
    }

    /**
     * 新解法
     */
    private static int max_2(int[] nums){
        int res = 0;
        int tmp = 0;
        for (int num : nums) {
            if (num == 1)
                tmp++;
            else {
                res = Math.max(res, tmp);
                tmp = 0;
            }
        }
        return Math.max(res,tmp);
    }
}
