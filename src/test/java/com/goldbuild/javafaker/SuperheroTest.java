package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SuperheroTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.superhero().name(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z' -/]+"));
    }

    @Test
    public void testPrefix() {
        assertThat(faker.superhero().prefix(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z -]+"));
    }

    @Test
    public void testSuffix() {
        assertThat(faker.superhero().suffix(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z -]+"));
    }

    @Test
    public void testPower() {
        assertThat(faker.superhero().power(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z/ -]+"));
    }

    @Test
    public void testDescriptor() {
        assertThat(faker.superhero().descriptor(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z' -]+"));
    }
}
