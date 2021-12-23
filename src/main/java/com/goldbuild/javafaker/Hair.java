package com.goldbuild.javafaker;

public class Hair {
    private final Faker faker;

    protected Hair(Faker faker) {
        this.faker = faker;
    }

    public String color() {
        return faker.fakeValuesService().resolve("hair.color", this, faker);
    }



}
