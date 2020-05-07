package array_string.summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description: 这是代码里唯一的注释
 * @author: QinYong
 * @create: 2020-05-07 11:29
 **/
public class YanghuiTriangle {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0) return new ArrayList<>();
        if(rowIndex == 0) return new ArrayList<>(Collections.singletonList(1));
        if(rowIndex == 1) return new ArrayList<>(Arrays.asList(1,1));
        int[] res = new int[rowIndex + 1];
        res[0] = 1;
        res[1] = 1;
        for(int i = 1; i < rowIndex; i++) {
            for(int j = i; j > 0; j--) {
                res[j] = res[j] + res[j - 1];
            }
            res[i + 1] = 1;
        }
        List<Integer> ans = new ArrayList<>();
        for(int n : res) {
            ans.add(n);
        }
        return ans;
    }

}
