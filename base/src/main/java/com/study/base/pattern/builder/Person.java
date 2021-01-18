package com.study.base.pattern.builder;

public class Person {
    private int id;
    private String name;
    private int age;
    private Person(){}

    static class PersonBuilder{
        Person p = new Person();

        public PersonBuilder buildId(int id){
            p.id = id;
            return this;
        }
        public PersonBuilder buildName(String name){
            p.name = name;
            return this;
        }
        public PersonBuilder buildAge(int age){
            p.age = age;
            return this;
        }
        public Person build(){
            return p;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
