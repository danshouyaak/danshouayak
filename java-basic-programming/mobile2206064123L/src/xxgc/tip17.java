package xxgc;

import java.util.Scanner;

//17、有规律的数列求和
//        题目描述
//        有一分数序列： 2/1 3/2 5/3 8/5 13/8 21/13...... 求出这个数列的前 N 项之和，保
//        留两位小数。
public class tip17 {
    public static void main(String[] args) {
        double sum = 0;
        double [] arr;
      arr = new double[999999999];
        arr[0]=1.0;
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      for (int i = 1;i<= N;i++){
          double x = 0;
          for (int j =1;j<= i;j++){
              x = (arr[j]+arr[j-1])/arr[j-1];
          }
         sum +=x;
      }
        System.out.println(sum);
    }
}
