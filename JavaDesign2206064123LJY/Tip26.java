package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip26 extends JLabel {
    public Tip26() {
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门26：自定义函数之字符串反转",JLabel.CENTER));
        add(new JLabel("写一函数，使输入的一个字符串按反序存放，在主函数中输入并输出反序后的字\n" +
                "符串",JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1  =new JTextField(10);
        jPanel1.add(jTextField1);
        add(jPanel1);



        JButton jButton = new JButton("计算");
        JPanel jPanel2 = new JPanel();
        jPanel2.add(jButton);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField2  =new JTextField(10);
        jTextField2.setEditable(false);
        jPanel3.add(jTextField2);
        add(jPanel3);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = String.valueOf(jTextField1.getText().toString());

                            String reverse = "";
                for (int i = a.length()-1; i>=0; i--) {
                    reverse = reverse + a.charAt(i);
                    System.out.println(reverse);
                }

                jTextField2.setText(reverse);
            }
        });
    }
}
