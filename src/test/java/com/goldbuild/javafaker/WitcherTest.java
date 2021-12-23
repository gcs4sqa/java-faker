package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class WitcherTest extends AbstractFakerTest {

    @Test
    public void testCharacter() {
        assertThat(faker.witcher().character(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z' -éúï]+"));
    }

    @Test
    public void testWitcher() {
        assertThat(faker.witcher().witcher(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z -ëúï]+"));
    }

    @Test
    public void testSchool() {
        assertThat(faker.witcher().school(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void testLocation() {
        assertThat(faker.witcher().location(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z -áâé]+"));
    }

    @Test
    public void testQuote() {
        assertThat(faker.witcher().quote(), MatchesRegularExpression.matchesRegularExpression("[-A-Za-z0-9 —;…\\?\\!\\.’‘'”“,\\[\\]]+"));
    }

    @Test
    public void testMonster() {
        assertThat(faker.witcher().monster(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z -]+"));
    }
}
