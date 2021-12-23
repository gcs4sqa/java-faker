package com.goldbuild.javafaker;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class GameOfThronesTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.gameOfThrones().character(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'\\-\\(\\) ]+"));
    }

    @Test
    public void house() {
        assertThat(faker.gameOfThrones().house(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z' ]+"));
    }

    @Test
    public void city() {
        assertThat(faker.gameOfThrones().city(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z' ]+"));
    }

    @Test
    public void dragon() {
        assertThat(faker.gameOfThrones().dragon(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void quote() {
        assertThat(faker.gameOfThrones().quote(), not(isEmptyOrNullString()));
    }
}
