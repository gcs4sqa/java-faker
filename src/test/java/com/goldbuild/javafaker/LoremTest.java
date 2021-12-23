package com.goldbuild.javafaker;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class LoremTest extends AbstractFakerTest {

    @Test
    public void shouldCreateFixedLengthString() {
        assertEquals(10, faker.lorem().fixedString(10).length());
        assertEquals(50, faker.lorem().fixedString(50).length());
        assertEquals(0, faker.lorem().fixedString(0).length());
        assertEquals(0, faker.lorem().fixedString(-1).length());
    }

    @Test
    public void wordShouldNotBeNullOrEmpty() {
        assertThat(faker.lorem().word(), not(isEmptyOrNullString()));
    }

    @Test
    public void testCharacter() {
        assertThat(String.valueOf(faker.lorem().character()), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{1}"));
    }

    @Test
    public void testCharacterIncludeUpperCase() {
        assertThat(String.valueOf(faker.lorem().character(false)), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{1}"));
        assertThat(String.valueOf(faker.lorem().character(true)), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z\\d]{1}"));
    }

    @Test
    public void testCharacters() {
        assertThat(faker.lorem().characters(), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{255}"));
    }

    @Test
    public void testCharactersIncludeUpperCase() {
        assertThat(faker.lorem().characters(false), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{255}"));
        assertThat(faker.lorem().characters(true), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z\\d]{255}"));
    }

    @Test
    public void testCharactersWithLength() {
        assertThat(faker.lorem().characters(2), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{2}"));
        assertThat(faker.lorem().characters(500), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{500}"));
        assertThat(faker.lorem().characters(0), isEmptyString());
        assertThat(faker.lorem().characters(-1), isEmptyString());
    }

    @Test
    public void testCharactersWithLengthIncludeUppercase() {
        assertThat(faker.lorem().characters(2, false), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{2}"));
        assertThat(faker.lorem().characters(500, false), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{500}"));
        assertThat(faker.lorem().characters(2, true), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z\\d]{2}"));
        assertThat(faker.lorem().characters(500, true), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z\\d]{500}"));
        assertThat(faker.lorem().characters(0, false), isEmptyString());
        assertThat(faker.lorem().characters(-1, true), isEmptyString());
    }

    @Test
    public void testCharactersMinimumMaximumLength() {
        assertThat(faker.lorem().characters(1, 10), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]{1,10}"));
    }

    @Test
    public void testCharactersMinimumMaximumLengthIncludeUppercase() {
        assertThat(faker.lorem().characters(1, 10, true), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z\\d]{1,10}"));
    }

    @Test
    public void testCharactersMinimumMaximumLengthIncludeUppercaseIncludeDigit() {
        assertThat(faker.lorem().characters(1, 10, false, false), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z]{1,10}"));
        assertThat(faker.lorem().characters(1, 10, true, true), MatchesRegularExpression.matchesRegularExpression("[a-zA-Z\\d]{1,10}"));
    }

    @Test
    public void testSentence() {
        assertThat(faker.lorem().sentence(), MatchesRegularExpression.matchesRegularExpression("(\\w+\\s?){4,10}\\."));
    }

    @Test
    public void testSentenceWithWordCount() {
        assertThat(faker.lorem().sentence(10), MatchesRegularExpression.matchesRegularExpression("(\\w+\\s?){11,17}\\."));
    }

    @Test
    public void testSentenceWithWordCountAndRandomWordsToAdd() {
        assertThat(faker.lorem().sentence(10, 10), MatchesRegularExpression.matchesRegularExpression("(\\w+\\s?){10,20}\\."));
    }

    @Test
    public void testSentenceFixedNumberOfWords() {
        assertThat(faker.lorem().sentence(10, 0), MatchesRegularExpression.matchesRegularExpression("(\\w+\\s?){10}\\."));
    }

    @Test
    public void testWords() {
        assertThat(faker.lorem().words(), hasSize(greaterThanOrEqualTo(1)));
    }
}
