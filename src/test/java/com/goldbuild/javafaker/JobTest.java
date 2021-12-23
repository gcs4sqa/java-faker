package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class JobTest extends AbstractFakerTest {

    @Test
    public void field() {
        assertThat(faker.job().field(), MatchesRegularExpression.matchesRegularExpression("^[A-Z][A-Za-z-]+$"));
    }

    @Test
    public void seniority() {
        assertThat(faker.job().seniority(), MatchesRegularExpression.matchesRegularExpression("^[A-Z][a-z]+$"));
    }

    @Test
    public void position() {
        assertThat(faker.job().position(), MatchesRegularExpression.matchesRegularExpression("^[A-Z][a-z]+$"));
    }

    @Test
    public void keySkills() {
        assertThat(faker.job().keySkills(), MatchesRegularExpression.matchesRegularExpression("([A-Za-z-]+ ?){1,3}"));
    }

    @Test
    public void title() {
        assertThat(faker.job().title(), MatchesRegularExpression.matchesRegularExpression("([A-Za-z-]+ ?){2,3}"));
    }
}
