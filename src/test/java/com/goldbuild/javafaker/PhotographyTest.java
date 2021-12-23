package com.goldbuild.javafaker;

import com.goldbuild.javafaker.repeating.Repeat;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhotographyTest extends AbstractFakerTest{

    @Test
    public void testAperture() {
        final String value = faker.photography().aperture();
        assertTrue(value.startsWith("f"));
    }

    @Test
    public void testTerm() {
        final String value = faker.photography().term();
        assertNonNullOrEmpty(value);
    }

    @Test
    public void brand() {
        final String value = faker.photography().brand();
        assertNonNullOrEmpty(value);
    }

    @Test
    public void camera() {
        final String value = faker.photography().camera();
        assertNonNullOrEmpty(value);
    }

    @Test
    public void lens() {
        final String value = faker.photography().lens();
        assertNonNullOrEmpty(value);
    }

    @Test
    public void genre() {
        final String value = faker.photography().genre();
        assertNonNullOrEmpty(value);
    }

    @Test
    public void imageTag() {
        final String value = faker.photography().imageTag();
        assertNonNullOrEmpty(value);
    }

    @Test
    @Repeat(times=7)
    public void shutter() {
        final String value = faker.photography().shutter();
        assertThat(value, MatchesRegularExpression.matchesRegularExpression("\\d{1,}\\/{0,1}\\d*"));
    }

    @Test
    @Repeat(times=7)
    public void iso() {
        final String value = faker.photography().iso();
        assertThat(value, MatchesRegularExpression.matchesRegularExpression("\\d{1,}"));
    }

    private void assertNonNullOrEmpty(String value) {
        assertNotNull(value);
        assertFalse(value.isEmpty());
    }
}