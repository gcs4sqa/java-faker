package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SlackEmojiTest extends AbstractFakerTest {

    private static final String EMOTICON_REGEX = ":([\\w-]+):";

    @Test
    public void people() {
        assertThat(faker.slackEmoji().people(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void nature() {
        assertThat(faker.slackEmoji().nature(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void food_and_drink() {
        assertThat(faker.slackEmoji().foodAndDrink(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void celebration() {
        assertThat(faker.slackEmoji().celebration(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void activity() {
        assertThat(faker.slackEmoji().activity(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void travel_and_places() {
        assertThat(faker.slackEmoji().travelAndPlaces(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void objects_and_symbols() {
        assertThat(faker.slackEmoji().objectsAndSymbols(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void custom() {
        assertThat(faker.slackEmoji().custom(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void emoji() {
        assertThat(faker.slackEmoji().emoji(), MatchesRegularExpression.matchesRegularExpression(EMOTICON_REGEX));
    }
}
