package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ColorTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.color().name(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){1,2}"));
    }

    @Test
    public void testHex() {
        assertThat(faker.color().hex(), MatchesRegularExpression.matchesRegularExpression("^#[0-9A-F]{6}$"));
    }

    @Test
    public void testHexNoHashSign() {
        assertThat(faker.color().hex(false), MatchesRegularExpression.matchesRegularExpression("^[0-9A-F]{6}$"));
    }
}
