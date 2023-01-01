package LJY2206064123;
//从键盘输入十位整数（学生自己十位数的学号），然后逆序输出。(输出结果示
//        例如下。)

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] studentID = new int[10];

        System.out.println("请输入你的学号：");
        for (int i = 0; i < studentID.length; i++) {
            studentID [i] = scanner.nextInt();
        }

        for (int i = 0 ,j = studentID.length-1;  i < j; i++ ,j--) {
            int temp = studentID[i];
            studentID[i] = studentID[j];
            studentID[j] = temp;
        }

        System.out.println("逆输出的结果为：");
        for (int j : studentID) {
            System.out.print(j + " ");
        }
    }
}
