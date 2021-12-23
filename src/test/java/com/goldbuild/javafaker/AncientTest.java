package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AncientTest extends AbstractFakerTest {

    @Test
    public void god() {
        assertThat(faker.ancient().god(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void primordial() {
        assertThat(faker.ancient().primordial(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void titan() {
        assertThat(faker.ancient().titan(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void hero() {
        assertThat(faker.ancient().hero(), MatchesRegularExpression.matchesRegularExpression("(?U)\\w+"));
    }

}
