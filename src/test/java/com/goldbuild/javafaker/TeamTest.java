package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.IsStringWithContents;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertThat;

public class TeamTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.team().name(), MatchesRegularExpression.matchesRegularExpression("(\\w+( )?){2,4}"));
    }

    @Test
    public void testCreature() {
        assertThat(faker.team().creature(), MatchesRegularExpression.matchesRegularExpression("\\w+( \\w+)?"));
    }

    @Test
    public void testState() {
        assertThat(faker.team().state(), MatchesRegularExpression.matchesRegularExpression("(\\w+( )?){1,2}"));
    }


    @Test
    public void testStateWithZaLocale() {
        Faker zaFaker = new Faker(new Locale("en-ZA"));
        assertThat(zaFaker.team().state(), IsStringWithContents.isStringWithContents());
    }
    @Test
    public void testSport() {
        assertThat(faker.team().sport(), MatchesRegularExpression.matchesRegularExpression("(\\p{L}|\\s)+"));
    }


}
