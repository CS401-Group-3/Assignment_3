package org.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import junit.framework.TestCase;

@RunWith(Parameterized.class)
public class StringUtilsTest extends TestCase {
    private String str1;
    private String str2;
    private String expectedConcat;
    private String expectedReverse;
    private String expectedToUpperCase;
    private String expectedTrim;

    public StringUtilsTest(String input1, String input2,
                         String expectedConcat, String expectedReverse,
                         String expectedToUpperCase, String expectedTrim) {
        this.str1 = input1;
        this.str2 = input2;
        this.expectedConcat = expectedConcat;
        this.expectedReverse = expectedReverse;
        this.expectedToUpperCase = expectedToUpperCase;
        this.expectedTrim = expectedTrim;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // Test case 1: Hello World
                {"hello", "world", "helloworld", "olleh", "HELLO", "hello"},
                // Test case 2: Empty Strings
                {"", "", "", "", "", ""},
                // Test case 3: Empty First Word
                {"", "world", "world", "", "", ""},
                // Test case 4: Empty Second Word
                {"hello", "", "hello", "olleh", "HELLO", "hello"},
                // Test case 5: Characters
                {"a", "b", "ab", "a", "A", "a"},
                // Test case 6: Numbers
                {"1", "2", "12", "1", "1", "1"},
                // Test case 7: Special Characters
                {"!@#", "$%^", "!@#$%^", "#@!", "!@#", "!@#"},
                // Test case 8: Random Inputs
                {"hello 123", "world !@#", "hello 123world !@#", "321 olleh", "HELLO 123", "hello 123"},
        });
    }
    
    @Test
    public void testConcat() {
        String actualResult = StringUtils.concat(str1, str2);
        assertEquals(expectedConcat, actualResult);
    }

    @Test
    public void testReverse() {
        String actualResult = StringUtils.reverse(str1);
        assertEquals(expectedReverse, actualResult);
    }

    @Test
    public void testToUpperCase() {
        String actualResult = StringUtils.toUpperCase(str1);
        assertEquals(expectedToUpperCase, actualResult);
    }

    @Test
    public void testTrim() {
        String actualResult = StringUtils.trim(str1);
        assertEquals(expectedTrim, actualResult);
    }
}
