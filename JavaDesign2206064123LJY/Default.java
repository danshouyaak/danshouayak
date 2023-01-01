package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Default {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JAVA程序实训开发");

        //jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(new JLabel("广东职业技术学院信息工程学院移动223廖家宇",JLabel.CENTER),BorderLayout.CENTER);

        JMenuBar jMenuBar = new JMenuBar();
        jFrame.setJMenuBar(jMenuBar);
        JMenuItem jMenuItem = new JMenuItem();
        JMenu jMenu1 = new JMenu("21-25题目");
        JMenu jMenu2 = new JMenu("26-30题目");
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);

        JMenuItem jMenuItem1_1 = new JMenuItem("编程入门21：筛选 N 以内的素数");
        JMenuItem jMenuItem1_2 = new JMenuItem("编程入门22：矩阵对角线求和");
        JMenuItem jMenuItem1_3 = new JMenuItem("编程入门23：数字逆序输出");
        JMenuItem jMenuItem1_4 = new JMenuItem("编程入门24：自定义函数处理最大公约数与最小公倍数");
        JMenuItem jMenuItem1_5 = new JMenuItem("编程入门25：自定义函数处理素数");
        JMenuItem jMenuItem2_1 = new JMenuItem("编程入门26：自定义函数之字符串反转");
        JMenuItem jMenuItem2_2 = new JMenuItem("编程入门27：自定义函数之字符串连接");
        JMenuItem jMenuItem2_3 = new JMenuItem("编程入门28：自定义函数之字符类型统计");
        JMenuItem jMenuItem2_4 = new JMenuItem("编程入门29：三个数字的排序");
        JMenuItem jMenuItem2_5 = new JMenuItem("编程入门30：平均值计算");
        jMenu1.add(jMenuItem1_1);
        jMenu1.add(jMenuItem1_2);
        jMenu1.add(jMenuItem1_3);
        jMenu1.add(jMenuItem1_4);
        jMenu1.add(jMenuItem1_5);
        jMenu2.add(jMenuItem2_1);
        jMenu2.add(jMenuItem2_2);
        jMenu2.add(jMenuItem2_3);
        jMenu2.add(jMenuItem2_4);
        jMenu2.add(jMenuItem2_5);

        jMenuItem1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip21());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip22());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem1_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip23());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem1_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip24());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem1_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip25());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip26());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip27());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem2_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip28());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem2_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip29());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jMenuItem2_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip30());
                jFrame.validate();
                jFrame.repaint();
            }
        });
        jFrame.setVisible(true);
    }
}
