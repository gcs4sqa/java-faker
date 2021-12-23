package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class EsportsTest extends AbstractFakerTest {

    @Test
    public void player() {
        assertThat(faker.esports().player(), MatchesRegularExpression.matchesRegularExpression("(\\w|.)+"));
    }

    @Test
    public void team() {
        assertThat(faker.esports().team(),  MatchesRegularExpression.matchesRegularExpression("((\\w|.)+ ?)+"));
    }

    @Test
    public void event() {
        assertThat(faker.esports().event(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?)+"));
    }

    @Test
    public void league() {
        assertThat(faker.esports().league(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void game() {
        assertThat(faker.esports().game(), MatchesRegularExpression.matchesRegularExpression("([\\w:.]+ ?)+"));
    }
}
