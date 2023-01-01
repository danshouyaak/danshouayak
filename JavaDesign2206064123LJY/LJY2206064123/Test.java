package LJY2206064123;
//        创建测试类，对分别对 Employee 类、Manager 进行实例化，传入相应参数，
//        调用涨薪方法，输出涨薪后工资。
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("张三","北京路");
        Manager manager = new Manager("12345",5000);
        manager.setId("12345");
        manager.setWage(5000);
        System.out.println("姓名："+employee.getName() + "  " + "地址："+employee.getAddress()+"  "+"工号："+manager.getId()+"  "+"工资："+manager.getWage()+"  "+"涨薪后工资为："+employee.add(5000));

        Employee employee1 = new Employee("李四","上海路");
        Manager manager1 = new Manager("56789",10000);
        manager1.setId("56789");
        manager1.setWage(10000);
        manager1.setLevel("经理三级");
        System.out.println("姓名："+employee1.getName()+"  "+"地址："+employee1.getAddress()+"  "+"工号："+manager1.getId()+"  "+"工资："+manager1.getWage()+"  "+"级别:"+manager1.getLevel()+"  "+"涨薪后工资为："+manager1.add(10000));
    }
}
