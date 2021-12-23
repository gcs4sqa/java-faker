package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DogTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.dog().name(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void breed() {
        assertThat(faker.dog().breed(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void sound() {
        assertThat(faker.dog().sound(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void memePhrase() {
        assertThat(faker.dog().memePhrase(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z0-9'\\/ ]+"));
    }

    @Test
    public void age() {
        assertThat(faker.dog().age(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void gender() {
        assertThat(faker.dog().gender(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void coatLength() {
        assertThat(faker.dog().coatLength(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void size() {
        assertThat(faker.dog().size(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }
}
