package com.goldbuild.javafaker;

import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class EducatorTest extends AbstractFakerTest {

    @Test
    public void testUniversity() {
        assertThat(faker.educator().university(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void testCourse() {
        assertThat(faker.educator().course(), MatchesRegularExpression.matchesRegularExpression("(\\(?\\w+\\)? ?){3,6}"));
    }

    @Test
    public void testSecondarySchool() {
        assertThat(faker.educator().secondarySchool(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void testCampus() {
        assertThat(faker.educator().campus(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){1,2}"));
    }
}
