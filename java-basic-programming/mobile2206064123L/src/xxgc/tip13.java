package xxgc;

import java.util.Scanner;

//13、阶乘求和
//        题目描述
//        求 Sn=1!+2!+3!+4!+5!+…+n!之值，其中 n 是一个数字(n 不超过 20)。
public class tip13 {
    public static void main(String[] args) {
        //k = n!
        int Sn = 0;
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>=1&n<=20){
        for (int i = 1;i<=n;i++){
            int k = 1;
            for (int j = 1;j<=i;j++){
                k *=j;
            }
            Sn += k;
        }
    } else {
            System.out.println("输入错误");
        }
        System.out.println(Sn);
    }
}
