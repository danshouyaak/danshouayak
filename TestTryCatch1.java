package xxgc.cn1;
//1、从控制台输入两个整数，计算并输出两个整数的商。利用异常处理实现当除数为0时，提示”除数不能为0“。
//
//        2、查看结果是否正确，请点击提交按钮。
//        1.输入两个整数
//
//        2.计算并输出两个整数的商
//
//        3.将以上语句写到try语句中
//
//        4.通过catch捕捉并处理异常

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch1 {
    public static void main(String[] args) {
       int [] a = {1,2,5,7,9};

       try {
           System.out.println(a[6]);
       }catch (Exception e){
           System.out.println("访问元素不存在");
       }


    }
}
