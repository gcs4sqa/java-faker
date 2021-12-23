package com.goldbuild.javafaker;

public class Clothing {
    private final Faker faker;

    protected Clothing(Faker faker) {
        this.faker = faker;
    }

    public String name() {
        return faker.fakeValuesService().resolve("clothing.name", this, faker);
    }

}
