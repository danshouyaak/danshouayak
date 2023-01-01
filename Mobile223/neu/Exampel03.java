package Mobile223.neu;

public class  Exampel03 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }
    static class MyThread implements Runnable{
        public void run() {
            System.out.println("开始");
        }
    }
}
