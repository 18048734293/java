package demo.shixunjava.project;
import javax.accessibility.AccessibleContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountFrame extends JFrame{
    //�ϲ����ò�ѯ�����������
    private JPanel PanelSearch=new JPanel();
    //�²��ṩadd,del,modify���������
    private JPanel panelProcess=new JPanel();
    //������
    private  JTextField txtSearch=new JTextField();
    ////������ť
    private  JButton btnSearch=new JButton("Search");
    private JLabel labView=new JLabel("���!");
    //��ӹ�����ʹ�õ���壬�����ܶ����
    private JPanel panelAdd=new JPanel();

    private JLabel labAddAcount=new JLabel("�˺ţ�");
    private JTextField txtAddAcount=new JTextField("");

    private JLabel labAddPassword=new JLabel("����");
    private JTextField txtAddPassword=new JTextField();

    private JLabel labAddnumber=new JLabel("����");
    private JTextField txtAddnumber=new JTextField();

    private JLabel labAddemailbox=new JLabel("��������");
    private JTextField txtAddemailbox=new JTextField();

    private JButton btnAdd=new JButton("Add");
    private JButton btnDelete=new JButton("Delete");
    private JButton btnModify=new JButton("Modify");

    public AccountFrame(){
    //======��ʼ�����======
    //PanelSearch.setBackground(Color.BLUE);
    //panelProcess.setBackground(Color.RED);

        PanelSearch.setLayout(new BorderLayout());//���ò���
        PanelSearch.add(txtSearch);//����������м䲿��
        PanelSearch.add(btnSearch,BorderLayout.EAST);//���������ť���ұ�
        //=====��ʼ��panelAdd������=====
        panelAdd.setLayout(new GridLayout(4,2));
        panelAdd.add(labAddAcount);
        panelAdd.add(txtAddAcount);
        panelAdd.add(labAddPassword);
        panelAdd.add(txtAddPassword);
        panelAdd.add(labAddnumber);
        panelAdd.add(txtAddnumber);
        panelAdd.add(labAddemailbox);
        panelAdd.add(txtAddemailbox);

        // panelAdd.setVisible(false);
        //��ʼ���ײ����
        panelProcess.add(btnAdd);
        panelProcess.add(btnDelete);
        panelProcess.add(btnModify);

        this.add(PanelSearch,BorderLayout.NORTH);//���������嵽�Ϸ�
        this.add(panelProcess,BorderLayout.SOUTH);//��Ӳ�����嵽�·�
        //this.add(panelAdd);
        this.add(labView);

        //����¼�����
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1.�õ��ı���text���ݣ�����������ݾ����߼�
                String text = btnAdd.getText();

                if (text.equals("Add")) {
                    //������Ӽ�¼�Ĳ���

                    //�Ƴ�LabView���
                    AccountFrame.this.remove(labView);
                    //���panel���м�
                    AccountFrame.this.add(panelAdd);
                    btnDelete.setText("cancel");
                    btnModify.setVisible(false);
                    text = "save";
                } else {
                    //��ԭ�س�ʼ��״̬
                    text = "Add";
                    AccountFrame.this.remove(panelAdd);
                    labView.setText("����ɹ�������");
                    AccountFrame.this.add(labView);
                    btnDelete.setText("delete");
                    btnModify.setVisible(true);
                }
                btnAdd.setText(text);
                //������ҳ��ˢ���ػ�
                AccountFrame.this.setVisible(false);
                AccountFrame.this.setVisible(true);
            }
        });
      //�趨�����������
        this.setSize(800,600);
        this.setTitle("�˻���ҳ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=txtSearch.getText();
                labView.setText(value);
            }
        });
        this.setSize(800,600);
        this.setTitle("�˺���ҳ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public static void main(String...args){
        new AccountFrame();
    }
}
