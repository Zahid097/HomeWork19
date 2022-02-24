package com.company;

public class Person {
    private byte numberOfPeople;

    public Person() {
    }

    public Person(byte numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public byte getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(byte numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "NumberOfPeople - "
                + numberOfPeople;
    }
}
