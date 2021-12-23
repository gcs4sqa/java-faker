package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

public class StarTrekTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.starTrek().character(), MatchesRegularExpression.matchesRegularExpression("^(\\w+-?'?\\.?\\s?)+$"));
    }

    @Test
    public void location() {
        assertThat(faker.starTrek().location(), MatchesRegularExpression.matchesRegularExpression("^(\\w+'?\\s?)+$"));
    }

    @Test
    public void specie() {
        assertThat(faker.starTrek().specie(), MatchesRegularExpression.matchesRegularExpression("^(\\w+-?'?\\s?)+$"));
    }

    @Test
    public void villain() {
        assertThat(faker.starTrek().villain(), MatchesRegularExpression.matchesRegularExpression("^(\\w+'?\\.?\\s?)+$"));
    }

    @Test
    public void klingon() { assertThat(faker.starTrek().klingon(), not(isEmptyOrNullString())); }
}
