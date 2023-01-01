package Mobile223.shijian;
//1、在当前类中定义三个私有属性：姓名name、性别sex、工资salary（实型)，
//
//        2、分别为这三个属性编写读取和设置访问器方法；
//
//        3、编写main方法，创建该类的对象w，通过设置方法设置姓名为李明、性别为男、工资为3800.0，通过读取方法输出这三个属性的值。
public class Tset2 {
    private String name;
    private String sex;
    private String salay;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalay(String salay) {
        this.salay = salay;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSalay() {
        return salay;
    }

    public static void main(String[] args) {
        Tset2 t = new Tset2();
        t.setName("李明");
        t.setSex("男");
        t.setSalay("3800.0");

        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSalay());
    }
}
