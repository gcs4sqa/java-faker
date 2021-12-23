package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.IsStringWithContents;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BusinessTest extends AbstractFakerTest {
    @Test
    public void creditCardNumber() {
        assertThat(faker.business().creditCardNumber(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void creditCardType() {
        assertThat(faker.business().creditCardType(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void creditCardExpiry() {
        assertThat(faker.business().creditCardExpiry(), IsStringWithContents.isStringWithContents());
    }

}
