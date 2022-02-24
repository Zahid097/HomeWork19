package com.company;

public class Main {

    public static void main(String[] args) {

        Person family1 = new Person((byte) 6);
        Person family2 = new Person((byte) 3);
        Person family3 = new Person((byte) 2);

        Person[] people1 = {family1};
        Person[] people2 = {family2};
        Person[] people3 = {family3};

        Apartment apartment = new Apartment(people1, "Prospect Chuy, 123.");
        System.out.println(apartment);
        apartment.payUtilities();

        Dormitory dormitory = new Dormitory(people2, "Karpinka, 16.");
        System.out.println(dormitory);
        dormitory.payRent();

        Hotel hotel = new Hotel(people3, "Isanova, 12.");
        System.out.println(hotel);
        hotel.payRent();
    }
}
