package array_string.doublePointer;

import java.util.Arrays;

/**
 * @description: 这是代码里唯一的注释
 * @author: QinYong
 * @create: 2020-05-06 13:43
 **/
public class DelSpecialNum {
    public static void main(String[] args) {
        int[] arr = {1,3,1,45,1,5};
        del(arr,1);
    }
    private static void del(int[] arr,int target){
        int fast = 0;
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i]!=target){
                arr[fast++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr)+"  k -> "+fast);
    }
}
