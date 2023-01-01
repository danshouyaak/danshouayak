package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip25 extends JLabel{
    public Tip25() {
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门25：自定义函数处理素数" ,JLabel.CENTER));
        add(new JLabel("写一个判断素数的函数，在主函数输入一个整数，输出是否是素数的消息。",JLabel.CENTER));

        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField(5);
        jPanel.add(jTextField);
        add(jPanel);

        JButton jButton = new JButton("计算");
        JPanel jPanel1 = new JPanel();
        jPanel1.add(jButton);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JTextField jTextField1 = new JTextField(5);
        jTextField1.setEditable(false);
        jPanel2.add(jTextField1);
        add(jPanel2);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField.getText().toString());

                for (int i = 2; i < a; i++) {
                    if (a % i == 0){
                        jTextField1.setText("not prime");
                    }else
                        jTextField1.setText("prime");
                    break;
                }
            }
        });
    }
}
