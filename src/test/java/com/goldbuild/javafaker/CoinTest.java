package com.goldbuild.javafaker;

import static org.junit.Assert.assertThat;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }
}