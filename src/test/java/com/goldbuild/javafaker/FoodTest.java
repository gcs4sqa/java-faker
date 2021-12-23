package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FoodTest extends AbstractFakerTest {

    @Test
    public void ingredient() {
        assertThat(faker.food().ingredient(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z- ]+"));
    }

    @Test
    public void spice() {
        assertThat(faker.food().spice(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z1-9- ]+"));
    }

    @Test
    public void dish() {
        assertThat(faker.food().dish(), MatchesRegularExpression.matchesRegularExpression("\\P{Cc}+"));
    }

    @Test
    public void fruit() {
        assertThat(faker.food().fruit(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z1-9- ]+"));
    }

    @Test
    public void vegetable() {
        assertThat(faker.food().vegetable(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z1-9- ]+"));
    }

    @Test
    public void sushi() {
        assertThat(faker.food().sushi(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z1-9- ]+"));
    }

    @Test
    public void measurement() {
        assertThat(faker.food().measurement(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z1-9/ ]+{2}"));
    }
}
