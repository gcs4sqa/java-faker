package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MusicTest extends AbstractFakerTest {

    @Test
    public void instrument() {
        assertThat(faker.music().instrument(), MatchesRegularExpression.matchesRegularExpression("\\w+ ?\\w+"));
    }

    @Test
    public void key() {
        assertThat(faker.music().key(), MatchesRegularExpression.matchesRegularExpression("([A-Z])+(b|#){0,1}"));
    }

    @Test
    public void chord() {
        assertThat(faker.music().chord(), MatchesRegularExpression.matchesRegularExpression("([A-Z])+(b|#){0,1}+(-?[a-zA-Z0-9]{0,4})"));
    }

    @Test
    public void genre() {
        assertThat(faker.music().genre(), MatchesRegularExpression.matchesRegularExpression("[[ -]?\\w+]+"));
    }
}
