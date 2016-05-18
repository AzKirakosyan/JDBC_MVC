package com.test;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;

public class MyFrame  extends JFrame implements ActionListener{

    private JTextArea area=new JTextArea(20,20);
    private JMenu menu=new JMenu("Ուսանողների տվյալների");
    private JMenuBar bar= new JMenuBar();
    private JMenuItem item=new JMenuItem("Ավելացնել ուսանող");
    private FrameInsertStudent insertStudent=new FrameInsertStudent();


    public MyFrame (){
        setLayout(new FlowLayout());
        add(area);

        bar.add(menu);
        menu.add(item);
        setJMenuBar(bar);
        item.addActionListener(this);



        StudentList.fillStudents();
        List<Student> list=StudentList.getStudents();
        String str="";

        for(Student s:list){
            str+=s.getStid()+" ";
            str+=s.getName()+" ";
            str+="\n";
            System.out.println(s.getStid()+" "+s.getName());

        }

        area.setText(str);


        setSize(600,600);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==item) {
            insertStudent.setVisible(true);



        }

    }
}
