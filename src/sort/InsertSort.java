package sort;

import java.util.Arrays;

/**
 * @description: 这是代码里唯一的注释
 * @author: QinYong
 * @create: 2020-05-08 14:13
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void test(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 && arr[j] > arr[i]; j--) {
                swap(arr,i,j);
            }
        }
    }

    private static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i-1;
            while (j >= 0 && tmp < arr[j]){
                arr[j+1] = arr[j];//没找到插入位置，整体向后移动
                j--;
            }
            //找到插入位置，
            arr[j+1] = tmp;
        }

    }
    private static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
