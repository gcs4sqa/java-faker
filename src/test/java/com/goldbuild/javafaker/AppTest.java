package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AppTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.app().name(), MatchesRegularExpression.matchesRegularExpression("([\\w-]+ ?)+"));
    }

    @Test
    public void testVersion() {
        assertThat(faker.app().version(), MatchesRegularExpression.matchesRegularExpression("\\d\\.(\\d){1,2}(\\.\\d)?"));
    }

    @Test
    public void testAuthor() {
        assertThat(faker.app().author(), MatchesRegularExpression.matchesRegularExpression("([\\w']+[-&,\\.]? ?){2,9}"));
    }
}
