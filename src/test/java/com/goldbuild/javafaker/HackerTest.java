package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class HackerTest extends AbstractFakerTest {

    @Test
    public void testAbbreviation() {
        assertThat(faker.hacker().abbreviation(), MatchesRegularExpression.matchesRegularExpression("[A-Z]{2,4}"));
    }

    @Test
    public void testAdjective() {
        assertThat(faker.hacker().adjective(), MatchesRegularExpression.matchesRegularExpression("(\\w+[- ]?){1,2}"));
    }

    @Test
    public void testNoun() {
        assertThat(faker.hacker().noun(), MatchesRegularExpression.matchesRegularExpression("\\w+( \\w+)?"));
    }

    @Test
    public void testVerb() {
        assertThat(faker.hacker().verb(), MatchesRegularExpression.matchesRegularExpression("\\w+( \\w+)?"));
    }

    @Test
    public void testIngverb() {
        assertThat(faker.hacker().ingverb(), MatchesRegularExpression.matchesRegularExpression("\\w+ing( \\w+)?"));
    }
}
