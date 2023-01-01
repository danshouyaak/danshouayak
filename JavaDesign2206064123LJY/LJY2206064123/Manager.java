package LJY2206064123;
//        创建 Manager 类并继承 Employee 类。在 Manager 类中定义私有级别属性 level，
//        并给出 level 的 getter 和 setter 方法；重写经理涨工资的 add()方法。
public class Manager extends Employee{
    private String level;

    public Manager(String id, double wage ) {
        super(id, String.valueOf(wage));
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double add(double wage){
        wage = (wage*0.2)+wage;

        return wage;
    }

}
