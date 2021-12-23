package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import java.text.DecimalFormatSymbols;

import static org.junit.Assert.assertThat;

public class CommerceTest extends AbstractFakerTest {

    private static final char decimalSeparator = new DecimalFormatSymbols().getDecimalSeparator();

    private static final String CAPITALIZED_WORD_REGEX = "[A-Z][a-z]+";

    private static final String PROMOTION_CODE_REGEX = CAPITALIZED_WORD_REGEX + "(-" + CAPITALIZED_WORD_REGEX + ")*";

    @Test
    public void testColor() {
        assertThat(faker.commerce().color(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){1,2}"));
    }

    @Test
    public void testDepartment() {
        assertThat(faker.commerce().department(), MatchesRegularExpression.matchesRegularExpression("(\\w+(, | & )?){1,3}"));
    }

    @Test
    public void testProductName() {
        assertThat(faker.commerce().productName(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){3,4}"));
    }

    @Test
    public void testMaterial() {
        assertThat(faker.commerce().material(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void testPrice() {
        assertThat(faker.commerce().price(), MatchesRegularExpression.matchesRegularExpression("\\d{1,3}\\" + decimalSeparator + "\\d{2}"));
    }

    @Test
    public void testPriceMinMax() {
        assertThat(faker.commerce().price(100, 1000), MatchesRegularExpression.matchesRegularExpression("\\d{3,4}\\" + decimalSeparator + "\\d{2}"));
    }

    @Test
    public void testPromotionCode() {
        assertThat(faker.commerce().promotionCode(), MatchesRegularExpression.matchesRegularExpression(PROMOTION_CODE_REGEX + PROMOTION_CODE_REGEX + "\\d{6}"));
    }

    @Test
    public void testPromotionCodeDigits() {
        assertThat(faker.commerce().promotionCode(3), MatchesRegularExpression.matchesRegularExpression(PROMOTION_CODE_REGEX + PROMOTION_CODE_REGEX + "\\d{3}"));
    }
}
