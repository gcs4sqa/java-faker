package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.IsANumber;
import com.goldbuild.javafaker.matchers.IsStringWithContents;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class AddressTest extends AbstractFakerTest {

    private static final char decimalSeparator = new DecimalFormatSymbols().getDecimalSeparator();

    @Test
    public void testStreetAddressStartsWithNumber() {
        final String streetAddressNumber = faker.address().streetAddress();
        assertThat(streetAddressNumber, MatchesRegularExpression.matchesRegularExpression("[0-9]+ .+"));
    }

    @Test
    public void testStreetAddressIsANumber() {
        final String streetAddressNumber = faker.address().streetAddressNumber();
        assertThat(streetAddressNumber, MatchesRegularExpression.matchesRegularExpression("[0-9]+"));
    }

    @Test
    public void testLatitude() {
        String latStr;
        Double lat;
        for (int i = 0; i < 100; i++) {
            latStr = faker.address().latitude().replace(decimalSeparator, '.');
            assertThat(latStr, IsANumber.isANumber());
            lat = new Double(latStr);
            assertThat("Latitude is less then -90", lat, greaterThanOrEqualTo(-90.0));
            assertThat("Latitude is greater than 90", lat, lessThanOrEqualTo(90.0));
        }
    }

    @Test
    public void testLongitude() {
        String longStr;
        Double lon;
        for (int i = 0; i < 100; i++) {
            longStr = faker.address().longitude().replace(decimalSeparator, '.');
            assertThat(longStr, IsANumber.isANumber());
            lon = new Double(longStr);
            assertThat("Longitude is less then -180", lon, greaterThanOrEqualTo(-180.0));
            assertThat("Longitude is greater than 180", lon, lessThanOrEqualTo(180.0));
        }
    }

    @Test
    public void testTimeZone() {
        assertThat(faker.address().timeZone(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z_]+/[A-Za-z_]+[/A-Za-z_]*"));
    }

    @Test
    public void testState() {
        assertThat(faker.address().state(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void testCity() {
        assertThat(faker.address().city(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'() ]+"));
    }

    @Test
    public void testCityName() {
        assertThat(faker.address().cityName(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'() ]+"));
    }

    @Test
    public void testCountry() {
        assertThat(faker.address().country(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z\\- &.,'()\\d]+"));
    }

    @Test
    public void testCountryCode() {
        assertThat(faker.address().countryCode(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void testStreetAddressIncludeSecondary() {
        assertThat(faker.address().streetAddress(true), not(isEmptyString()));
    }

    @Test
    public void testCityWithLocaleFranceAndSeed() {
        long seed = 1L;
        Faker firstFaker = new Faker(Locale.FRANCE, new Random(seed));
        Faker secondFaker = new Faker(Locale.FRANCE, new Random(seed));
        assertThat(firstFaker.address().city(), is(secondFaker.address().city()));
    }

    @Test
    public void testFullAddress() {
        assertThat(faker.address().fullAddress(), not(isEmptyOrNullString()));
    }

    @Test
    public void testZipCodeByState() {
        faker = new Faker(new Locale("en-US"));
        assertThat(faker.address().zipCodeByState(faker.address().stateAbbr()), MatchesRegularExpression.matchesRegularExpression("[0-9]{5}"));
    }

    @Test
    public void testHungarianZipCodeByState() {
        faker = new Faker(new Locale("hu"));
        assertThat(faker.address().zipCodeByState(faker.address().stateAbbr()), MatchesRegularExpression.matchesRegularExpression("[0-9]{4}"));
    }

    @Test
    public void testCountyByZipCode() {
        faker = new Faker(new Locale("en-US"));
        assertThat(faker.address().countyByZipCode("47732"), not(isEmptyOrNullString()));
    }

    @Test
    public void testStreetPrefix() {
        assertThat(faker.address().streetPrefix(), IsStringWithContents.isStringWithContents());
    }
}
