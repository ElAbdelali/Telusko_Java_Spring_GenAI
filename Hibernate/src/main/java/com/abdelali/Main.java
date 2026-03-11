package com.abdelali;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(6);
        s1.setsName("Samira");
        s1.setsAge(60);

        Student s2 = null;
//        s2.getRollNo();
//        s2.getsName();
//        s2.getsAge();

        Student s3 = new Student();
        s3.setRollNo(2);
        s3.setsName("Abdelali");
        s3.setsAge(31);



        //Configuration cfg = new Configuration();
        //cfg.addAnnotatedClass(com.abdelali.Student.class);
        //cfg.configure();

        SessionFactory sf = new Configuration().
                addAnnotatedClass(com.abdelali.Student.class).
                configure().buildSessionFactory();

        Session session = sf.openSession();
        //s2 = session.get(Student.class, 2); // fetching data

        Transaction transaction = session.beginTransaction();

        session.merge(s3);


        //session.persist(s1);
        transaction.commit();
        session.close();

        System.out.println(s3);


    }
}
