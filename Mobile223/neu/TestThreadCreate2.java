package Mobile223.neu;
//        1、使用Runnable接口创建并启动两个线程，一个线程输出1-50的数字，另一个线程输出A-Z的大写和小写字母。
//
//        2、在程序的main方法中先输出“mainbegins，”，分别创建和启动这两个线程，然后输出“mainends”，观察结果。
//        1.声明线程类ThreadA类，实现Runnable接口，在run方法中打印1-50的数字
//        2.声明线程类ThreadB类，实现Runnable接口，在run方法中打印A-Z的大小写字母
//        3.在main方法中创建线程类对象，请调用start方法启动。
public class TestThreadCreate2 {
    public static void main(String[] args) {
        System.out.println("mainbegins");

        ThreadA ta = new ThreadA();
        Thread thread1 = new Thread(ta);

        ThreadB tb = new ThreadB();
        Thread thread2 = new Thread(tb);

        System.out.println("mainends");

        thread1.start();
        thread2.start();
    }
    static class ThreadA implements Runnable{
        public void run() {
            for (int i = 1; i <=50 ; i++) {
                System.out.println(i);
            }
        }
    }
   static class ThreadB implements Runnable{
        public void run(){
            for (int i = 65; i <= 90 ; i++) {
                System.out.println((char) i);
            }
        }
    }

}
