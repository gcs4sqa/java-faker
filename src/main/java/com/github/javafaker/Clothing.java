package com.github.javafaker;

public class Clothing {
    private final Faker faker;

    protected Clothing(Faker faker) {
        this.faker = faker;
    }

    public String name() {
        return faker.fakeValuesService().resolve("clothing.name", this, faker);
    }

    public String hex() {
        return hex(true);
    }

    public String hex(boolean includeHashSign) {
        String hexString = faker.random().hex(6);
        if(includeHashSign)
            return "#" + hexString;
        return hexString;
    }
}
