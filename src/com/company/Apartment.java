package com.company;

import java.util.Arrays;

public class Apartment implements Utilities {

    Person[] people;
    private String address;

    @Override
    public void payUtilities() {
        System.out.println("Платит за коммунальные услуги в месяц: 8000-10000 сом." + '\n');
    }

    public Apartment() {

    }

    public Apartment(Person[] people, String address) {
        this.people = people;
        this.address = address;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return '\n' + "Apartment: " + Arrays.toString(people) +
                ", address - " + address;
    }
}
