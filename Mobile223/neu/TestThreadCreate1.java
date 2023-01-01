package Mobile223.neu;
//        1.声明线程类Threads1类，继承Thread类，在run方法中打印1-50的数字
//
//        2.声明线程类Threads2类，继承Thread类，在run方法中打印A-Z的大小写字母
//
//        3.在main方法中创建线程类对象，请调用start方法启动。

public class TestThreadCreate1 {
    public static void main(String[] args) {
        System.out.println("main begins");
        Threads1 t1 = new Threads1();
        Threads2 t2 = new Threads2();
        System.out.println("main ends");
        t1.start();
        t2.start();

    }
    static class Threads1 extends Thread{
        public void run(){
            for (int i = 1; i  < 50 ; i++) {
                System.out.println(i);
            }
        }
    }
    static class Threads2 extends Thread{
        public void run(){
            for (int i = 65; i <= 90 ; i++) {
                System.out.println((char) i);
            }
        }
    }
}
