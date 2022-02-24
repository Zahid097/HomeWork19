package com.company;

import java.util.Arrays;

public class Dormitory implements Rent {
    Person[] family;
    private String address;

    @Override
    public void payRent() {
        System.out.println("Платит за аренду в месяц: 7500 сом." + '\n');
    }

    public Dormitory() {

    }

    public Dormitory(Person[] family, String address) {
        this.family = family;
        this.address = address;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Dormitory: " + Arrays.toString(family) +
                ", address - " + address;
    }
}
