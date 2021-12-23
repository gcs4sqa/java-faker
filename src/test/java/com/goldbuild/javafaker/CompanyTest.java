package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CompanyTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.company().name(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z\\-&', ]+"));
    }

    @Test
    public void testSuffix() {
        assertThat(faker.company().suffix(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void testIndustry() {
        assertThat(faker.company().industry(), MatchesRegularExpression.matchesRegularExpression("(\\w+([ ,&/-]{1,3})?){1,4}+"));
    }

    @Test
    public void testBuzzword() {
        assertThat(faker.company().buzzword(), MatchesRegularExpression.matchesRegularExpression("(\\w+[ /-]?){1,3}"));
    }

    @Test
    public void testCatchPhrase() {
        assertThat(faker.company().catchPhrase(), MatchesRegularExpression.matchesRegularExpression("(\\w+[ /-]?){1,9}"));
    }

    @Test
    public void testBs() {
        assertThat(faker.company().bs(), MatchesRegularExpression.matchesRegularExpression("(\\w+[ /-]?){1,9}"));
    }

    @Test
    public void testLogo() {
        assertThat(faker.company().logo(), MatchesRegularExpression.matchesRegularExpression("https://pigment.github.io/fake-logos/logos/medium/color/\\d+\\.png"));
    }

    @Test
    public void testProfession() {
        assertThat(faker.company().profession(), MatchesRegularExpression.matchesRegularExpression("[a-z ]+"));
    }

    @Test
    public void testUrl() {
        String regexp = "(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])";
        assertThat(faker.company().url(), MatchesRegularExpression.matchesRegularExpression(regexp));
    }
}
