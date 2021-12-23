package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.IsStringWithContents;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MedicalTest extends AbstractFakerTest {

    @Test
    public void testMedicineName() {
        assertThat(faker.medical().medicineName(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testDiseaseName() {
        assertThat(faker.medical().diseaseName(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testHospitalName() {
        assertThat(faker.medical().hospitalName(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void testSymptom() {
        assertThat(faker.medical().symptoms(), IsStringWithContents.isStringWithContents());
    }


}