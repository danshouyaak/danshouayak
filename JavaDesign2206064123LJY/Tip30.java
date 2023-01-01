package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip30 extends JLabel {
    public Tip30() {
        setLayout(new GridLayout(7, 1));
        add(new JLabel("编程入门30：平均值计算", JLabel.CENTER));
        add(new JLabel("输入 10 个整数，求它们的平均值，并输出大于平均值的数据的个数。", JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(2);
        jPanel1.add(jTextField1);
        JTextField jTextField2 = new JTextField(2);
        jPanel1.add(jTextField2);
        JTextField jTextField3 = new JTextField(2);
        jPanel1.add(jTextField3);
        JTextField jTextField4 = new JTextField(2);
        jPanel1.add(jTextField4);
        JTextField jTextField5 = new JTextField(2);
        jPanel1.add(jTextField5);
        JTextField jTextField6 = new JTextField(2);
        jPanel1.add(jTextField6);
        JTextField jTextField7 = new JTextField(2);
        jPanel1.add(jTextField7);
        JTextField jTextField8 = new JTextField(2);
        jPanel1.add(jTextField8);
        JTextField jTextField9 = new JTextField(2);
        jPanel1.add(jTextField9);
        JTextField jTextField10 = new JTextField(2);
        jPanel1.add(jTextField10);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField0 = new JTextField(2);
        jTextField0.setEditable(false);
        jPanel3.add(jTextField0);
        add(jPanel3);


        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] a = {Integer.parseInt(jTextField1.getText().toString()),
                        Integer.parseInt(jTextField2.getText().toString()),
                        Integer.parseInt(jTextField3.getText().toString()),
                        Integer.parseInt(jTextField4.getText().toString()),
                        Integer.parseInt(jTextField5.getText().toString()),
                        Integer.parseInt(jTextField6.getText().toString()),
                        Integer.parseInt(jTextField7.getText().toString()),
                        Integer.parseInt(jTextField8.getText().toString()),
                        Integer.parseInt(jTextField9.getText().toString()),
                        Integer.parseInt(jTextField10.getText().toString())
                };


                double sum = 0;
                for (int i = 0; i <a.length; i++) {
                    sum += a[i];
                }
                jTextField0.setText(String.valueOf(sum/a.length));
                System.out.println(sum/a.length);
            }
        });
    }
}
