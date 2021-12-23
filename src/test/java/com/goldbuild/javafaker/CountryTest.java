package com.goldbuild.javafaker;

import com.goldbuild.javafaker.repeating.Repeat;
import com.goldbuild.javafaker.matchers.IsStringWithContents;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CountryTest extends AbstractFakerTest {

    @Test
    @Repeat(times=10)
    public void testFlag() {
        String flag = faker.country().flag();
        assertThat(flag, MatchesRegularExpression.matchesRegularExpression("^http:\\/\\/flags.fmcdn\\.net\\/data\\/flags\\/w580\\/[a-zA-Z0-9_]+\\.png$"));
    }


    @Test
    public void testCode2() {
        assertThat(faker.country().countryCode2(), MatchesRegularExpression.matchesRegularExpression("([a-z]{2})"));
    }

    @Test
    public void testCode3() {
        assertThat(faker.country().countryCode3(), MatchesRegularExpression.matchesRegularExpression("([a-z]{3})"));
    }

    @Test
    public void testCapital() {
        assertThat(faker.country().capital(), MatchesRegularExpression.matchesRegularExpression("([\\w'-]+ ?)+"));
    }

    @Test
    public void testCurrency() {
        assertThat(faker.country().currency(), MatchesRegularExpression.matchesRegularExpression("([A-Za-zÀ-ÿ'’()-]+ ?)+"));
    }

    @Test
    public void testCurrencyCode() {
        assertThat(faker.country().currencyCode(), MatchesRegularExpression.matchesRegularExpression("([\\w-’í]+ ?)+"));
    }

    @Test
    public void testName() {
        assertThat(faker.country().name(), IsStringWithContents.isStringWithContents());
    }
}
