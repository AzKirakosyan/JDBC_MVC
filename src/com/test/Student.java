package com.test;


import javax.xml.crypto.Data;
import java.util.Date;

public class Student {

    private int stid;
    private String name;
    private String sname;
    private Date date = new Date();
    private String adress;
    private int payment;


    public Student() {

    }

    public Student(int stid, String name, String sname, Date date,
                   String adress, int payment) {

        this.stid = stid;
        this.name = name;
        this.sname = sname;
        this.date = date;
        this.adress = adress;
        this.payment = payment;
    }

    public Student(String name, String sname, Date date,
                   String adress, int payment) {

        this.name = name;
        this.sname = sname;
        this.date = date;
        this.adress = adress;
        this.payment = payment;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPaymanent() {
        return payment;
    }

    public void setPaymanent(int paymanent) {
        this.payment = payment;
    }


}
