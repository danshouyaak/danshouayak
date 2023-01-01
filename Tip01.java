package xxgc.cn1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip01 extends JPanel{
    public Tip01() {
        // TODO �Զ����ɵĹ��캯�����
        setLayout(new GridLayout(7,1));
        add(new JLabel("�������1���򵥵�a+b",JLabel.CENTER));
        add(new JLabel("������������a��b������a+b�ĺ�",JLabel.CENTER));
        JPanel panel=new JPanel();
        JTextField numA=new JTextField(5);
        panel.add(numA);
        panel.add(new JLabel("+"));
        JTextField numB=new JTextField(5);
        panel.add(numB);
        panel.add(new JLabel("="));
        JTextField numC=new JTextField(5);
        numC.setEditable(false);
        panel.add(numC);
        add(panel);
        JButton button=new JButton("����");
        JPanel btnPanel=new JPanel();
        btnPanel.add(button);
        add(btnPanel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO �Զ����ɵķ������
                int a=Integer.parseInt(numA.getText().toString());
                int b=Integer.parseInt(numB.getText().toString());
                int c=a+b;
                numC.setText(String.valueOf(c));
            }

        });
    }
}
