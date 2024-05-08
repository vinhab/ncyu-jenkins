import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void convert1() {
        String excepted = "A";
        String actual = converter.convert(100);
        assertEquals(excepted, actual);
    }
    @Test
    public void convert2() {
        String excepted = "A";
        String actual = converter.convert(90);
        assertEquals(excepted, actual);
    }
}