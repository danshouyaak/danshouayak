package LJY2206064123;
//父类
//        某公司的人员分为员工和经理两种，但经理也属于员工中的一种，公司的人员都
//        有自己的姓名和地址，员工和经理都有自己的工号、工资、工龄、级别等属性，但经理
//        不同员工的是，经理有自己在公司对应的级别。假设每次给员工涨工资一次能涨 10%，
//        经理能涨 20%。请使用继承的思想特点进行继承体系的设计。
//        创建父类 Person 类，在 Person 类中定义私有的 name 和 address 属性，定义该
//        类的构造方法（参数为 name 和 address），以及 setter 和 getter 方法。
public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
