package com.goldbuild.javafaker;

import com.goldbuild.javafaker.repeating.Repeat;
import com.goldbuild.javafaker.matchers.IsStringWithContents;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiseaseTest extends AbstractFakerTest {
    @Test
    public void testInternalDisease() {
        Faker faker = new Faker();
        assertThat(faker.disease().internalDisease(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testNeurology() {
        Faker faker = new Faker();
        assertThat(faker.disease().neurology(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testSurgery() {
        Faker faker = new Faker();
        assertThat(faker.disease().surgery(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testPaediatrics() {
        Faker faker = new Faker();
        assertThat(faker.disease().paediatrics(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testGynecologyAndObstetrics() {
        Faker faker = new Faker();
        assertThat(faker.disease().gynecologyAndObstetrics(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testOphthalmologyAndOtorhinolaryngology() {
        Faker faker = new Faker();
        assertThat(faker.disease().ophthalmologyAndOtorhinolaryngology(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testDermatolory() {
        Faker faker = new Faker();
        assertThat(faker.disease().dermatolory(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }


    @Test
    public void testInternalDiseaseWith10000Times() {
        Faker faker = new Faker();
        boolean isExist = false;
        for (int i = 0; i < 10000; i++) {
            String generateString = faker.disease().internalDisease();
            if (generateString.equals("anaphylaxis")) {
                isExist = true;
            }
        }
        assertTrue(isExist);
    }

    @Test
    @Repeat(times = 10000)
    public void testNeurologyWith10000Times() {
        Faker faker = new Faker();
        assertThat(faker.disease().neurology(), IsStringWithContents.isStringWithContents());
    }

    @Test
    @Repeat(times = 10000)
    public void testSurgeryWith10000Times() {
        Faker faker = new Faker();
        assertThat(faker.disease().surgery(), IsStringWithContents.isStringWithContents());
    }

    @Test
    @Repeat(times = 10000)
    public void testPaediatricsWith10000Times() {
        Faker faker = new Faker();
        assertThat(faker.disease().paediatrics(), IsStringWithContents.isStringWithContents());
    }

    @Test
    @Repeat(times = 10000)
    public void testGynecologyAndObstetricsWith10000Times() {
        Faker faker = new Faker();
        assertThat(faker.disease().gynecologyAndObstetrics(), IsStringWithContents.isStringWithContents());
    }

    @Test
    @Repeat(times = 10000)
    public void testOphthalmologyAndOtorhinolaryngologyWith10000Times() {
        Faker faker = new Faker();
        assertThat(faker.disease().ophthalmologyAndOtorhinolaryngology(), IsStringWithContents.isStringWithContents());
    }

    @Test
    @Repeat(times = 10000)
    public void testDermatoloryWith10000Times() {
        Faker faker = new Faker();
        assertThat(faker.disease().dermatolory(), IsStringWithContents.isStringWithContents());
    }

}
