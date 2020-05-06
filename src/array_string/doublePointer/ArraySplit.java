package array_string.doublePointer;

import java.util.Arrays;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，
 * 使得从1 到 n 的 min(ai, bi) 总和最大。
 **/
public class ArraySplit {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        //System.out.println(test(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //先排序 后分组
    private static int test(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum+=arr[i];
        }
        return sum;
    }

    /**
     * 复习快排
     */
    private static void quickSort(int[] arr,int i,int j){
        if(i>=j)return;
        int pivot = arr[i];
        int m = i,n = j;
        while (m < n){
            //必须先从大的指针开始,原因在于基准点选取问题
            //如果基准点选在最后一位 就要从前先判断
            while (m < n && arr[n] >= pivot)
                n--;
            while (m < n && arr[m] <= pivot)
                m++;
            if(m < n)
                swap(arr,m,n);
        }
        swap(arr,i,m);
        quickSort(arr,i,m-1);
        quickSort(arr,m+1,j);
    }
    private static void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a]  = arr[b];
        arr[b]  = tmp;
    }

}
