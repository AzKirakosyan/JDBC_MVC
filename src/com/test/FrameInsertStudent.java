package com.test;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FrameInsertStudent extends JFrame implements  ActionListener {


    private JTextField fieldname=new JTextField(10);
    private JLabel labelname=new JLabel("Անուն");
    private JTextField fieldsname=new JTextField(10);
    private JLabel labelsname=new JLabel("Ազգանուն");
    private JTextField fielddate=new JTextField(10);
    private JLabel labeldate=new JLabel("Ամսաթիվ");
    private JTextField fieldadress=new JTextField(10);
    private JLabel labeladress=new JLabel("Հասցե");
    private JTextField fieldpayment=new JTextField(10);
    private JLabel labelpayment=new JLabel("Վճար");
    private JButton buttoninsert=new JButton("Ավելացնել Ուսանող");
    private JPanel panel=new JPanel();

    public FrameInsertStudent(){

        setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(5,2));
        panel.add(labelname);
        panel.add(fieldname);
        panel.add(labelsname);
        panel.add(fieldsname);
        panel.add(labeldate);
        panel.add(fielddate);
        panel.add(labeladress);
        panel.add(fieldadress);
        panel.add(labelpayment);
        panel.add(fieldpayment);
        add(panel);
        add(buttoninsert);
        buttoninsert.addActionListener(this);


        setSize(400, 200);
        //setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttoninsert){
            String name=fieldname.getText();
            String sname=fieldsname.getText();
            String date=fielddate.getText();
            String s[]=new String[3];
            s=date.split("-");
            int year=Integer.parseInt(s[0]);
            int month=Integer.parseInt(s[1]);
            int day=Integer.parseInt(s[2]);

            String adress=fieldadress.getText();
            String payment=fieldpayment.getText();
            int paymentInt=Integer.parseInt(payment);
            Date dateInsert=new Date(year,month,day);
            Student studentInsert=new Student(name,sname,dateInsert, adress,paymentInt);

            StudentList.insertStudent(studentInsert);


        }


    }

    }
