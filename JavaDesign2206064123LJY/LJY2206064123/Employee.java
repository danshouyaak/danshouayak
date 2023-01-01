package LJY2206064123;

//        创建 Employee 类并继承 Person 类，创建该类的构造方法，在构造方法中调用
//        父类的构造方法。在 Employee 类中定义私有属性：员工的工号 ID、工资 wage、年龄 age，
//        并创建相应的 setter 和 getter 方法。创建员工涨薪的方法 add()。
public class Employee extends Person {
    private String id;
    private int age;
    private double wage;

    public Employee(String name, String address) {
        super(name, address);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double add(double wage){
        wage = (wage*0.1)+wage;

        return wage;
    }
}
