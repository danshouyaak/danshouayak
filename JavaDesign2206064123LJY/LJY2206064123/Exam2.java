package LJY2206064123;
//2、从键盘输入自己十位数的学号，求它们的平均值，并输出大于平均值的数据的个
//        数。(输出结果示例如下。)

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入十个正数：");
        for (int i = 0; i < arr.length ; i++) {
             arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int average = sum/ arr.length;

        int count = 0;//用来记录大于平均数的个数
        for (int j : arr) {
            if (average < j) {
                count++;
            }
        }
        System.out.println("大于平均数整数的个数为："+count);
    }
}
