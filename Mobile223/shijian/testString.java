package Mobile223.shijian;

import java.util.Locale;
//
//        1、在当前类testString中编写静态方法isHuiWen(String s)，采用字符串的方法判断s是否是回文串（一个字符串从前读它和从后读它都是一样的。例如："abcba"），返回值为布尔型；
//
//2、在main方法中定义字符串str="abcba"，调用isHuiWen（str）方法判断它是否是回文串，输出返回结果。
//        1.编写静态方法isHuiWen(String s)，在该方法中通过循环判断s是否为回文串，并将结果返回（提示：可以循环判断第一个字符和最后一个字符是否相等）；
//        2.在main()中定义字符串str="abcba"，调用isHuiWen（str）方法判断它是否是回文串。
public class testString {

    static boolean isHuiWen(String str){
        for (int i = 0,j =str.length()-1 ; i <j ; i++,j--) {
            if (str.charAt(i) == str.charAt(j)){
                break;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str="abcba";
        System.out.println(isHuiWen(str));
    }
}
