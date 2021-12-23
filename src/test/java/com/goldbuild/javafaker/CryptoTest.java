package com.goldbuild.javafaker;

import static org.junit.Assert.assertThat;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;


public class CryptoTest extends AbstractFakerTest {

    @Test
    public void testMd5() {
        assertThat(faker.crypto().md5(), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]+"));
    }

    @Test
    public void testSha1() {
        assertThat(faker.crypto().sha1(), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]+"));
    }

    @Test
    public void testSha256() {
        assertThat(faker.crypto().sha256(), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]+"));
    }

    @Test
    public void testSha512() {
        assertThat(faker.crypto().sha512(), MatchesRegularExpression.matchesRegularExpression("[a-z\\d]+"));
    }
}
