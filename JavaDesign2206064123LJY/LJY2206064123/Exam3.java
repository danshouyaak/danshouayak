package LJY2206064123;

import java.util.Scanner;

//从键盘输入一个百分制的成绩，要求输出成绩等级‘A’、‘B’、‘C’、‘D’、‘E’。
//        90 分以及 90 分以上为 A，80-89 分为 B，70-79 分为 C，60-69 分为 D，60 分以下
//        为 E。(输出结果示例如下。)
public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的成绩：");

    while (true){
        int studentAch = scanner.nextInt();
        if (studentAch > 100){
            System.out.println("请输入小于等于100的成绩");
        } else if (studentAch >= 90 ){
            System.out.println("成绩等级为A");
            break;
        } else if (studentAch>=80 ) {
            System.out.println("成绩等级为B");
            break;
        } else if (studentAch >= 70 ) {
            System.out.println("成绩等级为C");
            break;
        } else if (studentAch >= 60) {
            System.out.println("成绩等级为D");
            break;
         }
       }
    }
}
