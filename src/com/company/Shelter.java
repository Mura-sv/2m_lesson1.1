package com.company;

import jdk.jshell.JShell;

public class Shelter {

    private String name;
    private String address;

    public Shelter(String name,String address){
        this.name=name;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }


}
