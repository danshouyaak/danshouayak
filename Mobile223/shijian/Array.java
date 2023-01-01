package Mobile223.shijian;

public class Array {
    public static void main(String[] args) {
        char [] ch = {'A','a','B','b','2','*','H','T','9','&'};

        int upper = 0;
        int lower = 0;
        int number = 0;
        int other = 0;
        for (int i = 0;i<ch.length ;i++ ){
            for (int j = 65;j<=90 ;j++ ){
                if (ch[i] == j){
                    upper++;
                }
            }
        }

        for (int i = 0;i<ch.length ;i++ ){
            for (int j = 97;j<=122 ;j++ ){
                if(ch[i] == j){
                    lower++;
                }
            }
        }

        for (int i = 0;i<ch.length ;i++ ){
            for (int j = 48;j<=57 ;j++ ){
                if (ch[i] == j){
                    number++;
                }
            }
        }

        for (int i = 0;i<ch.length ;i++ ){
            for (int j = 33;j<=47 ;j++ ){
                if (ch[i] == j){
                    other++;
                }
            }
        }
        System.out.println("大写字母个数为:"+upper);
        System.out.println("小写字母个数为:"+lower);
        System.out.println("数字个数为:"+number);
        System.out.println("其他字母个数为:"+other);
    }
}
