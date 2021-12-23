package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BookTest extends AbstractFakerTest {

    @Test
    public void testTitle() {
        assertThat(faker.book().title(), MatchesRegularExpression.matchesRegularExpression("([\\p{L}'\\-\\?]+[!,]? ?){2,9}"));
    }

    @Test
    public void testAuthor() {
        assertThat(faker.book().author(), MatchesRegularExpression.matchesRegularExpression("([\\w']+\\.? ?){2,3}"));
    }

    @Test
    public void testPublisher() {
        assertThat(faker.book().publisher(), MatchesRegularExpression.matchesRegularExpression("([\\p{L}'&\\-]+[,.]? ?){1,5}"));
    }

    @Test
    public void testGenre() {
        assertThat(faker.book().genre(), MatchesRegularExpression.matchesRegularExpression("([\\w/]+ ?){2,4}"));
    }
}
