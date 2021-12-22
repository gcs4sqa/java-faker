package datagenerator;

import com.github.javafaker.Faker;

public class datagen1 {

    public static void main(String[] args) {
        Faker faker = new Faker();

       for (int i =0; i < 1000; i++) {

           System.out.println(faker.clothing().name());
       }
    }
}
