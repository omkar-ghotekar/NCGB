package com.example.microservice.demo;



import java.util.Objects;

public class Person {

    private Integer pid;
    private String name;
    private String phone;


    public Integer getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pid, person.pid) && Objects.equals(name, person.name) && Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, name, phone);
    }

    public Person(Integer pid, String name, String phone) {
        this.pid = pid;
        this.name = name;
        this.phone = phone;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
