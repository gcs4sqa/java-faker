package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * @author Luka Obradovic (luka@vast.com)
 */
public class LordOfTheRingsTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.lordOfTheRings().character(), MatchesRegularExpression.matchesRegularExpression("(?U)([\\w ]+ ?)+"));
    }

    @Test
    public void location() {
        assertThat(faker.lordOfTheRings().location(), MatchesRegularExpression.matchesRegularExpression("(?U)([\\w'\\- ]+ ?)+"));
    }
}
