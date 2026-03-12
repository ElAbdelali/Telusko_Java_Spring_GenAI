package com.abdelali;


import java.beans.ConstructorProperties;

public class Alien {
    private Computer com;
    private int age;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Alien() {
        //System.out.println("Object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
//    @ConstructorProperties({"age","laptop"})
    public Alien(int age, Computer com){
        //System.out.println("Para Constructor called");
        this.age = age;
        this.com = com;
    }
}
