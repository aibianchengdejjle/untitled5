package com.company;

public class student {
    private  String id;
    private  String name;
    private  String age;
    private  String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public student(String id,String name,String age,String address)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.address=address;
    }
}
