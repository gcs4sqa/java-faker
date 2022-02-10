package datagenerator;


import com.goldbuild.javafaker.Faker;
import static com.goldbuild.javafaker.service.ValueSplitter.*;

import java.util.Locale;

import javax.sound.sampled.SourceDataLine;



public class datagen1 {

    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("en-GB"));


       for (int i =0; i < 100; i++) {

            String hair = faker.hair().color();
        //    System.out.println("name = " + faker.clothing().name());
        //    System.out.println("hair color = " + valueSplitter(hair,1));
        //    System.out.println("hair code = " + valueSplitter(hair,0));
            System.out.println(faker.address().postcode());
            System.out.println(faker.address().country());
            System.out.println(faker.address().state());
            System.out.println(faker.address().streetAddress());
            System.out.println(faker.internet().domainSuffix());

            System.out.println(faker.clothing().name());


       }
    }




}
