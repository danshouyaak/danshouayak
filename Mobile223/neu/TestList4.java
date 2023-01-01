package Mobile223.neu;

import java.util.ArrayList;

//        1. 声明类UserManager；
//        2. 在类中创建一个ArrayList类型的users属性；
//        3. 声明一个添加用户的方法addUser(User user),调用集合的add方法；
//        4. 声明一个删除用户的方法deleteUser(String name),调用集合的remove方法；
//        5.声明一个判断一个用户是否存在的方法isExist(User user),调用接口的contains方法；
//        6. 声明一个显示所有用户信息的方法display()。
//        1、在用户管理类（UserManager），通过ArrayList提供用户管理服务。
//        2、在UserManager类中定义一个ArrayList的属性users;
//        3、UserManager类中定义如下几个方法操作users中的用户(参照main方法中UserManager类的调用方法编写)：
//        （1）添加用户addUser方法，向users中添加一个用户信息。
//        （2）删除用户deleteUser方法，从users中删除一个用户信息。
//        （3）判断一个用户是否存在isExist方法，判断users中是否存在该用户。
//        （4）显示所有用户信息display方法：直接输出user对象信息。
//        3、直接运行程序，显示如下运行结果。
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String toString() {
        return "name is:" + name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User u = (User) obj;
            return this.name.equals(u.name);
        } else {
            return false;
        }
    }
}

class UserManager {
    ArrayList users = new ArrayList<>();

    public void addUser(User tom){
        users.add(tom);
    }
    public void deleteUser(User tom){
        users.remove(tom);
    }
    public void isExist(User alice){
        users.contains(alice);
    }
    public void display(){
        System.out.println(users);
    }
}

public class TestList4 {
    public static void main(String[] args) {
        UserManager um = new UserManager();
        User user = new User("aaa");
        um.addUser(new User("tom"));
        um.addUser(new User("alice"));
        um.addUser(new User("john"));
        um.deleteUser(new User("tom"));
        um.isExist(new User("alice"));
        um.display();
    }
}
