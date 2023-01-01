package Mobile223.shijian;
//1、在当前类Array的main方法中，首先定义一个字符型数组ch，长度为10，初始值为'A','a','B','b','2','*','H','T','9','&'；
//
//        2、在该数组中求出大写字母、小写字母、数字、其他字符的个数，并输出结果。
//1.在main()中定义一个字符型数组ch，长度为10，初始值为'A','a','B','b','2','*','H','T','9','&'；
//        2.在该数组中定义四个变量upper,lower,number,other分别表示大写字母、小写字母、数字、其他字符的个数，
//        在for循环中通过if语句来判断数组中的每个字符所在范围并统计相应的个数，最后输出。

public class Tset1 {
    public static void main(String[] args) {
        char [] ch ={'A','a','B','b','2','*','H','T','9','&' };
        int upper = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 65; j <=90 ; j++) {
               if (ch[i] == j){
                   upper++;
               }
            }
        }
        int lower = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 97; j <=122 ; j++) {
                if (ch[i]==j){
                    lower++;
                }
            }
        }
        int number = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 48; j <= 57 ; j++) {
                if (ch[i] == j){
                    number++;
                }
            }
        }
        int other = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 33; j <= 47 ; j++) {
                if (ch[i] == j){
                    other++;
                }
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);
        System.out.println(other);




    }
}
