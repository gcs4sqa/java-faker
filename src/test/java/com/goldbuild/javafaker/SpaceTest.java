package com.goldbuild.javafaker;

import static org.junit.Assert.assertThat;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class SpaceTest extends AbstractFakerTest {

    @Test
    public void planet() {
        assertThat(faker.space().planet(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void moon() {
        assertThat(faker.space().moon(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void galaxy() {
        assertThat(faker.space().galaxy(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void nebula() {
        assertThat(faker.space().nebula(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void starCluster() {
        assertThat(faker.space().starCluster(), MatchesRegularExpression.matchesRegularExpression("(\\w+[ -]?){1,3}"));
    }

    @Test
    public void constellation() {
        assertThat(faker.space().constellation(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void star() {
        assertThat(faker.space().star(), MatchesRegularExpression.matchesRegularExpression("(\\w+[ -]?){2,3}"));
    }

    @Test
    public void agency() {
        assertThat(faker.space().agency(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,5}"));
    }

    @Test
    public void agencyAbbreviation() {
        assertThat(faker.space().agencyAbbreviation(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void nasaSpaceCraft() {
        assertThat(faker.space().nasaSpaceCraft(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void company() {
        assertThat(faker.space().company(), MatchesRegularExpression.matchesRegularExpression("((\\w|')+ ?){2,4}"));
    }

    @Test
    public void distanceMeasurement() {
        assertThat(faker.space().distanceMeasurement(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void meteorite() {
        assertThat(faker.space().meteorite(), MatchesRegularExpression.matchesRegularExpression("(?U)([\\w()]+[ -–]?){1,4}"));
    }
}
