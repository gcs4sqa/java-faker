package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.IsStringWithContents;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BackToTheFutureTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.backToTheFuture().character(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void date() {
        assertThat(faker.backToTheFuture().date(), MatchesRegularExpression.matchesRegularExpression("([A-za-z]{3,8}) ([1-9]|[1-2]\\d|3[0-1]), (18[8-9]\\d|19[0-9]\\d|200\\d|201[0-5])"));
    }

    @Test
    public void quote() {
        assertThat(faker.backToTheFuture().quote(), IsStringWithContents.isStringWithContents());
    }
}
