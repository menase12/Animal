package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat a = new Cat();
        a.setName("xxxxx");
        System.out.println("The animal called "+a.getName());
        System.out.println(a.speak());
        System.out.println(a.act());

        Unicorn b = new Unicorn();
        b.setName("yyyyyy");
        System.out.println("The animal called "+b.getName());
        System.out.println(b.flies());
        System.out.println(b.magic());

        //System.out.println(""+a.getName());
        //System.out.println();
    }
}
