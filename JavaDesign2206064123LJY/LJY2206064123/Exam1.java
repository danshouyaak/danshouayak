package LJY2206064123;
//求出 10 至 1000 之内能同时被 2、3、及学生学号最后 1 位数整除的数，并打印输
//        出。（例如学号为：2206012347，则计算能被 2,3,7 整除的数，输出结果示例如
//        下。注意：如学号最后一位为 0，改为 5。
public class Exam1 {
    public static void main(String[] args) {
        String studentID = "2206064123";
        int a = studentID.length()-1;
        String b = String.valueOf(studentID.charAt(a));
        String c = String.valueOf(0);
        if (!c.equals(b)) {//判断最后一位数不为0
            for (int j = 10; j <= 1000 ; j++) {
                if (j % 2 == 0 & j % 3 == 0 & j % studentID.indexOf(a)==0){
                    System.out.println(j);
                }
            }
        } else {
            for (int i = 10; i <= 1000 ; i++) {
                if (i%2==0 & i% 3==0 & i % 5 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
