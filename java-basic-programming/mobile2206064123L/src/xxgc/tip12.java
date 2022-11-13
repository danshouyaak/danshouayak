package xxgc;

import java.util.Scanner;

//12、Sn 的公式求和
//        题目描述
//        求 Sn=a+aa+aaa+…+aa…aaa（有 n 个 a）之值，其中 a 是一个数字，为 2。 例如，
//        n=5 时=2+22+222+2222+22222，n 由键盘输入。
public class tip12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int [999999999];
        arr[0] = n;
        int sum = 0 ;
        for(int i = 1;i<=n;i++){
            arr[i+1]= arr [i] * 10 + 2;
        }
        for(int i=1;i<=n;i++){
            sum += arr[i+1];
        }
        System.out.println(sum);
    }
}
