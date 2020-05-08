package array_string.summary;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 **/
public class ReverseWordsIII {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverse(str));
    }
    private static String reverse(String words){
        String[] strings = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            sb.append(exc(s)).append(" ");
        }
        return sb.toString().trim();
    }
    private static String exc(String str){
        char[] chars = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            char c = chars[i];
            chars[i++] = chars[j];
            chars[j--] = c;
        }
        return String.valueOf(chars);
    }

}
