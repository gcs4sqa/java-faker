package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class HarryPotterTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.harryPotter().character(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z,\\-\\.\\(\\) ]+"));
    }

    @Test
    public void location() {
        assertThat(faker.harryPotter().location(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z0-9'\\. &,/]+"));
    }

    @Test
    public void quote() {
        assertThat(faker.harryPotter().quote(), not(isEmptyOrNullString()));
    }

    @Test
    public void book() {
        assertThat(faker.harryPotter().book(), MatchesRegularExpression.matchesRegularExpression("Harry Potter and the ([A-Za-z'\\-]+ ?)+"));
    }

    @Test
    public void house() {
        assertThat(faker.harryPotter().house(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void spell() {
        assertThat(faker.harryPotter().spell(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }
}
