package com.test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentList {
    private static List<Student>list=new ArrayList<>();
    private static Statement statement =null;
    private static ResultSet resultSet=null;


    public static void fillStudents(){

        try {
            statement=DatabaseConnect.databaseConnect().createStatement();
            resultSet = statement.executeQuery("select * from student");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        int stid;
        String name;
        String sname;
        Date date=new Date();
        String adress;
        int payment;
        Student student=null;


        try {
            while (resultSet.next()) {

                stid=resultSet.getInt(1);
                name=resultSet.getString(2);
                sname=resultSet.getString(3);
                date=resultSet.getDate(4);
                adress=resultSet.getString(5);
                payment=resultSet.getInt(6);

                student =new Student(stid, name, sname,date,adress,payment);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static List<Student> getStudents(){

        return list;
    }
    public static void insertStudent(Student student) {
        System.out.println(student.getName()+" "+student.getDate());

    }

}
