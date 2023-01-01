package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip01 extends JPanel {
    public Tip01(){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门21：简单的 a+b",JLabel.CENTER));
        add(new JLabel("输入两个整数 a 和 b，计算 a+b 的和",JLabel.CENTER));
        JPanel panel = new JPanel();
        JTextField numA = new JTextField(5);
        panel.add(numA);//1
        panel.add(new JLabel("+"));
        JTextField numB = new JTextField(5);
        panel.add(numB);//2
        panel.add(new JLabel("="));
        JTextField numC = new JTextField(5);
        numC.setEditable(false);
        panel.add(numC);//3
        add(panel);
        JButton button = new JButton("计算");
        JPanel btPanel = new JPanel();
        btPanel.add(button);
        add(btPanel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(numA.getText().toString());
                int b = Integer.parseInt(numB.getText().toString());
                int c = a + b;
                numC.setText(String.valueOf(c));
            }
        });
    }
}
