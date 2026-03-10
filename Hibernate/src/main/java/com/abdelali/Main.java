package com.abdelali;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(5);
        s1.setsName("Ayan");
        s1.setsAge(8);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.abdelali.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(s1);
        transaction.commit();


        System.out.println(s1);


    }
}
