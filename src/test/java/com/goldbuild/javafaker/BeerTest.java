package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BeerTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.beer().name(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testStyle() {
        assertThat(faker.beer().style(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'() 0-9-]+"));
    }

    @Test
    public void testHop() {
        assertThat(faker.beer().hop(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'’()\\. 0-9-]+"));
    }

    @Test
    public void testMalt() {
        assertThat(faker.beer().malt(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'() 0-9-]+"));
    }

    @Test
    public void testYeast() {
        assertThat(faker.beer().yeast(), MatchesRegularExpression.matchesRegularExpression("[\\p{L}'() 0-9-ö]+"));
    }
}
