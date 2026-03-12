package com.abdelali;


public class Alien {
    private Laptop laptop;
    private int age;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Alien() {
        System.out.println("Object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        laptop.compile();
    }
}
