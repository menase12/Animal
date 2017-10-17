package com.company;

public class Cat {
    private String name;
    public String speak() {
        return "A cat speaks purr";

    }
    public String getName(){
        return name;
    }
    public void setName(String value){
        name = value;
    }
    public String act(){
        return "A cat can scratches and bites";
    }
}
