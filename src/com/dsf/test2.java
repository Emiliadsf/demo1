package com.dsf;

public class test2 {
    private int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public test2(int age) {
        this.age = age;
    }

    public test2() {
    }
    public void parent(){
        System.out.println("你好，我是父类");
    }

}

class son extends test2 {

    public void parent(){
        System.out.println("son");
    }
    public static void main(String[] args) {
        son son1 = new son();
        son1.name="zhabngsan";
        son1.parent();
    }
}

