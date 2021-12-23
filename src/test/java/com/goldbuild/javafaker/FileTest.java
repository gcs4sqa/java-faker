package com.goldbuild.javafaker;

import com.goldbuild.javafaker.repeating.Repeat;
import com.goldbuild.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FileTest extends AbstractFakerTest {

    @Test
    @Repeat(times=10)
    public void testExtension() {
        assertThat(faker.file().extension(),
                MatchesRegularExpression.matchesRegularExpression("(flac|mp3|wav|bmp|gif|jpeg|jpg|png|tiff|css|csv|html|js|json|txt|mp4|avi|mov|webm|doc|docx|xls|xlsx|ppt|pptx|odt|ods|odp|pages|numbers|key|pdf)"));
    }

    @Test
    @Repeat(times=10)
    public void testMimeTypeFormat() {
        assertThat(faker.file().mimeType(), MatchesRegularExpression.matchesRegularExpression(".+\\/.+"));
    }

    @Test
    @Repeat(times=10)
    public void testFileName() {
        assertThat(faker.file().fileName(), MatchesRegularExpression.matchesRegularExpression("([a-z\\-_]+)(\\\\|\\/)([a-z\\-_]+)\\.([a-z0-9]+)"));
    }

    @Test
    public void testFileNameSpecifyExtension() {
        assertThat(faker.file().fileName(null, null, "txt", null), 
                MatchesRegularExpression.matchesRegularExpression("([a-z\\-_]+)(\\\\|\\/)([a-z\\-_]+)\\.txt"));
    }

    @Test
    public void testFileNameSpecifyDir() {
        assertThat(faker.file().fileName("my_dir", null, null, null),
                MatchesRegularExpression.matchesRegularExpression("my_dir(\\\\|\\/)([a-z\\-_]+)\\.([a-z0-9]+)"));
    }

    @Test
    public void testFileNameSpecifySeparator() {
        assertThat(faker.file().fileName(null,null,null,"\\"), 
                MatchesRegularExpression.matchesRegularExpression("([a-z\\-_]+)\\\\([a-z\\-_]+)\\.([a-z0-9]+)"));
    }

    @Test
    public void testFileNameSpecifyName() {
        assertThat(faker.file().fileName(null,"da_name",null,null),
                MatchesRegularExpression.matchesRegularExpression("([a-z\\-_]+)(\\\\|\\/)da_name\\.([a-z0-9]+)"));
    }
}
