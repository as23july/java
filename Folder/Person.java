package Folder;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Address address;
    private Cars[] car;


    public Person(String name, int age, Address address, Cars[] car){
        this.name = name;
        this.age = age;
        this.address = address;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cars[] getCar() {
        return car;
    }

    public void setCar(Cars[] car) {
        this.car = car;
    }
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + ", cars=" + Arrays.toString(car) + '}';
    }
   
}
