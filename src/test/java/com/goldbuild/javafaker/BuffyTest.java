package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.IsStringWithContents;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BuffyTest extends AbstractFakerTest {
    @Test
    public void testCharacters() {
        assertThat(faker.buffy().characters(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testQuotes() {
        assertThat(faker.buffy().quotes(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testCelebrities() {
        assertThat(faker.buffy().celebrities(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testBigBads() {
        assertThat(faker.buffy().bigBads(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testEpisodes() {
        assertThat(faker.buffy().episodes(), IsStringWithContents.isStringWithContents());
    }
}
