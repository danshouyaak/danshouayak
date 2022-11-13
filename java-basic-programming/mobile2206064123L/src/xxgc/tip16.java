package xxgc;

import java.util.Scanner;

//16、完数的判断
//        题目描述
//        一个数如果恰好等于不包含它本身所有因子之和，这个数就称为"完数"。例如，
//        6 的因子为 1、2、3，而 6=1+2+3，因此 6 是"完数"。 编程序找出 N 之内的所有
//        完数，并按下面格式输出其因子

//1:找出因子  2：因子累加  3判断是否相等
//6 its factors are 1 2 3
//28 its factors are 1 2 4 7 14
//496 its factors are 1 2 4 8 16 31 62 124 248
public class tip16 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N - 1; i++) {
           int sum = 0;
           for (int j =1;j<=i/2;j++){
               if(i%j==0){
                   //选出因子
                  //System.out.print(j);
                   sum += j;
               }
           }
           if (sum == i){
               System.out.println(sum);
           }
        }
    }
}
