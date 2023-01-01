package Mobile223;
/*
采用continue和break关键字，在该类中计算1-1000中能被3整除的数的和，
如果和大于5000，不再计算，并输出这个和。
1、在main方法中用变量sum来表示累加和，在for循环体中(循环变量i)，首先判断和是否大于5000，如果大于5000，不再计算，使用break退出循环；
2、如果和不大于5000，再判断是不是3的倍数，如果不是3的倍数，结束本次循环，继续下一次循环，用continue；
3、如果是3的倍数，并且和小于等于5000，累加这个数，最后输出结果。
 */
public class fanduan {
    public static void main(String[] args) {
        int param = 1000;
        //int sum ;
        System.out.println(fo(param));
    }
    static int fo(int param){
        int sum = 0;
        int i = 1;
        for(i=1;i<=param;i++){
            sum+=i;
            if(sum>5000){
                break;
           }
            if(sum<=5000 & sum%3!=0){
               // sum +=i;
                continue;
            }
            if(sum%3==0 & sum<=5000){
                sum+=i;
            }
        }
        return sum;
    }
}

