package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip23 extends JLabel {
    public Tip23() {
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门23：数字逆序输出" ,JLabel.CENTER));
        add(new JLabel("输入 10 个数字，然后逆序输出。",JLabel.CENTER));

        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField(10);
        jPanel.add(jTextField);
        add(jPanel);

        JButton jButton = new JButton("计算");
        JPanel jPanel1 = new JPanel();
        jPanel1.add(jButton);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JTextField jTextField1 = new JTextField(10);
        jTextField1.setEditable(false);
        jPanel2.add(jTextField1);
        add(jPanel2);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField.getText().toString());
                String b = String.valueOf(a);
                char[]c  = b.toCharArray();

                StringBuffer sb = new StringBuffer();
                for (int i = c.length-1; i >= 0 ; i--) {
                    sb.append((char)c[i]);
                }
                jTextField1.setText(String.valueOf(sb).replace(""," "));
                System.out.println("计算完成");
            }
        });
    }
}
