package demo.shixunjava.project;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFrame extends JFrame {
    public AddFrame(){
        //设置初始位置和大小
        this.setTitle("添加账号信息界面");

//        创建顶部的面板
        JPanel panelNorth = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelSouth = new JPanel();
        //创建和添加顶部面板的内容
        JTextField fieldSearth = new JTextField(60);
        JButton btnSearth = new JButton("Search");
        panelNorth.add(fieldSearth);
        panelNorth.add(btnSearth);
        this.add(panelNorth,BorderLayout.PAGE_START);


        GridLayout gridLayout = new GridLayout(4,2);
        gridLayout.setHgap(5);
        gridLayout.setVgap(3);
        panelCenter.setLayout(gridLayout);
        JLabel labelTitile = new JLabel("title:",SwingConstants.CENTER);

        JLabel labelAccount = new JLabel("account:",SwingConstants.CENTER);

        JLabel labelPassword = new JLabel("password:",SwingConstants.CENTER);

        JLabel labelRemark = new JLabel("remark:",SwingConstants.CENTER);

        JTextArea areaTitile = new JTextArea();
        JTextArea areaAccount = new JTextArea();
        JTextArea areaPassword = new JTextArea();
        JTextArea areaRemark= new JTextArea();
        panelCenter.add(labelTitile);
        panelCenter.add(areaTitile);
        panelCenter.add(labelAccount);
        panelCenter.add(areaAccount);
        panelCenter.add(labelPassword);
        panelCenter.add(areaPassword);
        panelCenter.add(labelRemark);
        panelCenter.add(areaRemark);

        this.add(panelCenter,BorderLayout.CENTER);
        //添加最先面的

        JButton btnConfirm = new JButton("Confirm");
        JButton btnCancle = new JButton("Cancle");
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(areaTitile.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Titile could not be null!");
                    areaTitile.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,1)));
                }else if(areaAccount.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"ccount could not be null!");
                    areaAccount.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,1)));
                }else if(areaPassword.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Password could not be null!");
                    areaPassword.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,1)));
                }
                String massage = "Titile:"+areaTitile.getText()+"\nAccount:"+areaAccount.getText()+"\nPassword:"+areaPassword.getText()+"\nRemark:"+areaRemark.getText();
                JOptionPane.showMessageDialog(null,massage);
            }
        });
        panelSouth.add(btnConfirm);
        panelSouth.add(btnCancle);
        this.add(panelSouth,BorderLayout.PAGE_END);

        this.setVisible(true);
        this.setBounds(500,200,800,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args){
        AddFrame addFrame = new AddFrame();
    }
}
