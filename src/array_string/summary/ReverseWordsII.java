package array_string.summary;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 **/
public class ReverseWordsII {
    public static void main(String[] args) {
        String str = "  a good   example  ";
        //System.out.println(reverse2(str));
        String pat = "^[0-9a-zA-z].*";
        boolean b = Pattern.compile(pat).matcher(" 1231").find();
        System.out.println(b);
        System.out.println(str.trim().replaceAll("^[0-9a-zA-z]{1}\\s{2,}", " "));
    }
    private static void reverse(String words){
        String[] strings = words.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length-1; i >= 0 ; i--) {
            if(!strings[i].equals(" ")){
                sb.append(strings[i].trim()).append(" ");
            }
        }
        System.out.println(sb.toString());
        System.out.println(Arrays.toString(strings));
    }
    private static String reverse2(String words){
        String s = words.trim().replaceAll("^\\w\\s{2,}", " ");
        String[] strings = s.split(" ");
        int i = 0;
        int j = strings.length-1;
        String tmp;
        while (i < j){
            tmp = strings[i];
            strings[i++] = strings[j];
            strings[j--] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strings){
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
