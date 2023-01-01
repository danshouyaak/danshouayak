package Mobile223.shijian;

public class Teacher3 extends Person3{
    public void Teacher3(){
        System.out.println("这是子类");
    }
    public static void main(String[] args) {
        Teacher3 t = new Teacher3();
        t.Person3();
        t.Teacher3();
    }
}
