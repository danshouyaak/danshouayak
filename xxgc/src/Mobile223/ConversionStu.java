package Mobile223;

import java.io.PrintStream;

/*
1、在该类中编写方法PerfectNum（静态、无参数、无返回值），
2、在方法中编写代码：找出200以内的所有完全数。并将结果输出到控制台。
完全数定义：一个数若恰好等于它的各因子之和，即称其为完全数。如6=1+2+3，其中1、2、3为因子，6是完全数。
3、在main方法中调用函数。
    1、在该类中编写PerfectNum方法，该方法静态、无参数、无返回值。
2、for循环从1到200，循环变量为i。定义变量factor表示因子，sum为因子的和；当sum等于i时，即找到了完全数，将其输出。
3、在main方法中调用PerfectNum方法。
 */
public class ConversionStu {

    public static void main(String[] args) {
        for (int i=1;i <=200;i++){
            int result =0;
            for(int j=1;j<=i/2;j++){//第一个for 判断是不是因子
                if (i%j==0){
                    result +=j;
                }
            }
            if(result==i){
                System.out.println(i);
            }
        }
            }
        }
