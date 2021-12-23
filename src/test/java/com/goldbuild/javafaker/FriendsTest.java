package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class FriendsTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.friends().character(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z .,]+"));
    }

    @Test
    public void location() {
        assertThat(faker.friends().location(), MatchesRegularExpression.matchesRegularExpression("[\\w.', ]+"));
    }

    @Test
    public void quote() {
        assertThat(faker.friends().quote(), not(isEmptyOrNullString()));
    }
}
