package com.abdelali;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Entity(name="alien_table") to change table name and not use the class name as the table name
// can also do the following: @Table(name=name of table)
public class Alien {

    @Id
    private int aid;
    // @Column(name=column name)
    private String aname;
    //@Transient will disallow the addition of the following data
    private String tech;
    //@OneToOne maps one laptop to one alien
    //private Laptop laptop;
    //@OneToMany(mappedBy = "alien") // Alien entity should not map
//    @ManyToMany
//    private List<Laptop> laptops;
    @OneToMany
    private List<Laptop> laptops;
    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }
//    private
    //    public Laptop getLaptops() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }


    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
