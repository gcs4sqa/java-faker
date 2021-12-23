package com.goldbuild.javafaker;

import com.goldbuild.javafaker.repeating.Repeat;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DuneTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.dune().character(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z '\\-\"]+"));
    }

    @Test
    public void title() {
        assertThat(faker.dune().title(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void planet() {
        assertThat(faker.dune().planet(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void quote() {
        assertThat(faker.dune().quote(), MatchesRegularExpression.matchesRegularExpression("\\P{Cc}+"));
    }

    @Test
    @Repeat(times = 10000)
    public void randomQuote() {
        assertThat(
                faker.dune().quote(faker.options().option(Dune.Quote.class)),
                MatchesRegularExpression.matchesRegularExpression("\\P{Cc}+"));
    }

    @Test
    public void saying() {
        assertThat(faker.dune().saying(), MatchesRegularExpression.matchesRegularExpression("\\P{Cc}+"));
    }

    @Test
    @Repeat(times = 10000)
    public void randomSaying() {
        assertThat(
                faker.dune().saying(faker.options().option(Dune.Saying.class)),
                MatchesRegularExpression.matchesRegularExpression("\\P{Cc}+"));
    }

}
