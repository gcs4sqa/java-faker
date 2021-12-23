package com.goldbuild.javafaker;

import static org.junit.Assert.assertThat;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class PokemonTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.pokemon().name(), MatchesRegularExpression.matchesRegularExpression("[\\w']+.?( \\w+)?"));
    }

    @Test
    public void location() {
        assertThat(faker.pokemon().location(), MatchesRegularExpression.matchesRegularExpression("\\w+( \\w+)?( \\w+)?"));
    }
}
