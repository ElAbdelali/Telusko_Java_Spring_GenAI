package com.abdelali;

public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling with Desktop");
    }

    public Desktop(){
        System.out.println("Desktop object created");
    }
}
