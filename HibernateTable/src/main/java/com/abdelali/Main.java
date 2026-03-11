package com.abdelali;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Laptop laptop1 = new Laptop();
//        laptop1.setBrand("Apple");
//        laptop1.setModel("M5 Macbook Pro");
//        laptop1.setRam(24);

        //one to one
//        Laptop laptop1 = new Laptop();
//        laptop1.setLid(1);
//        laptop1.setBrand("Apple");
//        laptop1.setModel("M5 Macbook Pro");
//        laptop1.setRam(24);
//
//        Alien alien1 = new Alien();
//        alien1.setAid(1);
//        alien1.setAname("Ali");
//        alien1.setTech("Java");
//        alien1.setLaptop(laptop1);

//        // many to one
//        Laptop laptop1 = new Laptop();
//        laptop1.setLid(1);
//        laptop1.setBrand("Apple");
//        laptop1.setModel("M5 Macbook Pro");
//        laptop1.setRam(24);
//
//        Laptop laptop2 = new Laptop();
//        laptop2.setLid(2);
//        laptop2.setBrand("Apple");
//        laptop2.setModel("M4 Macbook Pro");
//        laptop2.setRam(16);
//
//        Alien alien1 = new Alien();
//        alien1.setAid(1);
//        alien1.setAname("Ali");
//        alien1.setTech("Java");
//        alien1.setLaptops(Arrays.asList(laptop1, laptop2));
//
//        laptop1.setAlien(alien1);
//        laptop2.setAlien(alien1);


//        Laptop laptop1 = new Laptop();
//        laptop1.setLid(4);
//        laptop1.setBrand("Asus");
//        laptop1.setModel("Strix");
//        laptop1.setRam(32);

//        Laptop laptop2 = new Laptop();
//        laptop2.setLid(2);
//        laptop2.setBrand("Apple");
//        laptop2.setModel("M4 Macbook Pro");
//        laptop2.setRam(16);
//
//        Laptop laptop3= new Laptop();
//        laptop3.setLid(3);
//        laptop3.setBrand("Apple");
//        laptop3.setModel("i9 Macbook Pro");
//        laptop3.setRam(32);

//        Alien a1 = new Alien();
//        a1.setAname("John");
//        a1.setAid(1);
//        a1.setTech("AI");
//
//        Alien a2 = new Alien();
//        a2.setAname("Jane");
//        a2.setAid(2);
//        a2.setTech("Java");

//        Alien a3 = new Alien();
//        a3.setAname("Jacob");
//        a3.setAid(3);
//        a3.setTech("Python");

//
//        a1.setLaptops(Arrays.asList(laptop1,laptop2));
//        a2.setLaptops(Arrays.asList(laptop3));
//        a3.setLaptops(Arrays.asList(laptop1));

//        laptop1.setAliens(Arrays.asList(a1,a3));
//        laptop2.setAliens(Arrays.asList(a1,a2));
//        laptop3.setAliens(Arrays.asList(a2));


        SessionFactory sf = new Configuration().
//                addAnnotatedClass(com.abdelali.Alien.class).
                addAnnotatedClass(com.abdelali.Laptop.class).
                configure().
                buildSessionFactory();

        Session session = sf.openSession();

//        Transaction tx = session.beginTransaction();

//        session.persist(laptop1);
//        session.persist(laptop2);
//        session.persist(alien1);

//        session.persist(laptop1);
//        session.persist(laptop2);
//        session.persist(laptop3);
//        session.persist(a1);
//        session.persist(a2);

//        tx.commit();

//        Alien a5 = session.find(Alien.class,2);
//        System.out.println(a5);


        //normal fetch
        Laptop l1 = session.get(Laptop.class, 3);
        System.out.println(l1);



        // fetching laptop details using hql
        // normal sql query: select * from laptop; select * from laptop where ram = 32;
        // hql: from laptop where ram=32;

        Query query = session.createQuery("from Laptop");
        List<Laptop> laptops = query.getResultList();
        Query query2 = session.createQuery("from Laptop where ram = 32");
        List<Laptop> laptops2 = query2.getResultList();
        System.out.println(laptops2);

        // fetching with brand
        String brand = "Apple";
        Query query3 = session.createQuery("from Laptop where brand like ?1");
        query3.setParameter(1, brand);
        List<Laptop> laptops3 = query3.getResultList();
        System.out.println(laptops3);

        //single field

        Query query4 = session.createQuery("select model from Laptop where brand like ?1");
        query4.setParameter(1, brand);
        List<Laptop> laptops4 = query4.getResultList();
        System.out.println(laptops4);
        session.close();
        sf.close();





    }
}
