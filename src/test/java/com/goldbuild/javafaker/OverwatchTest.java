package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class OverwatchTest extends AbstractFakerTest {

    @Test
    public void hero() {
        assertThat(faker.overwatch().hero(), MatchesRegularExpression.matchesRegularExpression("^(\\w+\\.?\\s?)+$"));
    }

    @Test
    public void location() {
        assertThat(faker.overwatch().location(), MatchesRegularExpression.matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void quote() {
        assertFalse(faker.overwatch().quote().isEmpty());
    }
}
