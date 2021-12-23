package datagenerator;


import com.goldbuild.javafaker.Faker;
import static com.goldbuild.javafaker.service.ValueSplitter.*;



public class datagen1 {

    public static void main(String[] args) {
        Faker faker = new Faker();


       for (int i =0; i < 1000; i++) {


           System.out.println("name = " + faker.clothing().name());
           System.out.println("hair color = " + valueSplitter(faker.hair().color(),1));
           System.out.println("hair code = " + valueSplitter(faker.hair().color(),0));



       }
    }




}
