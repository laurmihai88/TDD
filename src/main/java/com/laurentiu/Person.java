package com.laurentiu;

public class Person {
    private int age;

    public boolean isTeenager(){
        if (this.age >= 10 && this.age<20){
            return true;
        } else {
            return false;
        }
    }

    public void setAge(int age){
        this.age = age;
    }
}
