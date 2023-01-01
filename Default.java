package xxgc.cn1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Default {
    public static void main(String[] args) {
        // TODO �Զ����ɵķ������
        JFrame jFrame=new JFrame("Java���򿪷�ʵѵ");
        jFrame.setSize(600,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(new JLabel("�㶫ְҵ����ѧԺ��Ϣ����ѧԺ��Java���򿪷�ʵѵ��XXX��XXX",JLabel.CENTER), BorderLayout.CENTER);
        JMenuBar jMenuBar=new JMenuBar();
        jFrame.setJMenuBar(jMenuBar);
        JMenu jMenu1=new JMenu("1-5��Ŀ");
        JMenu jMenu2=new JMenu("6-10��Ŀ");
        JMenu jMenu3=new JMenu("11-115��Ŀ");
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenu3);

        JMenuItem jMenuItem1_1=new JMenuItem("�������1���򵥵�a+b");
        JMenuItem jMenuItem1_2=new JMenuItem("�������2�����������ֵ");
        JMenuItem jMenuItem1_3=new JMenuItem("�������3����������");
        JMenuItem jMenuItem1_4=new JMenuItem("�������4���¶�ת��");
        JMenuItem jMenuItem1_5=new JMenuItem("�������5���ֶκ�����ֵ");
        jMenu1.add(jMenuItem1_1);
        jMenu1.add(jMenuItem1_2);
        jMenu1.add(jMenuItem1_3);
        jMenu1.add(jMenuItem1_4);
        jMenu1.add(jMenuItem1_5);
        jMenuItem1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO �Զ����ɵķ������
                jFrame.getContentPane().removeAll();
                jFrame.add(new Tip01());
                jFrame.validate();
                jFrame.repaint();
            }

        });
        jFrame.setVisible(true);
    }
}
