package demo.shixunjava.project;
//SWingApplication.java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SwingApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame.setDefaultLookAndFeelDecorated(true);
//����JFrame����۷��
JFrame frame=new JFrame("Swing Frame");
//����һ��JFrame�ඥ������
//��ö����������������contenpane,ֻ��ͨ�������ܼ����������
//�������м�����JRootpane��һ����
Container contentpane=frame.getContentPane();
JPanel panel=new JPanel();
//����һ��JPanel����м�����panel
panel.setBorder(BorderFactory.createLineBorder(Color.black,50));
//���ñ߿�
panel.setLayout(new GridLayout(2,1));
//���ò���
JLabel label=new JLabel("label",SwingConstants.CENTER);
//����ԭ�����Label
JButton button=new JButton("Button");
//��ԭ�������ӵ��м�������
panel.add(label);
panel.add(button);
contentpane.add(panel);
//���м�����ͨ�����������ӵ�����������
frame.pack();
//�������������
frame.setVisible(true);
//��ʾ
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//�رմ�GUI��ر�Ӧ�ó���
	}

}
