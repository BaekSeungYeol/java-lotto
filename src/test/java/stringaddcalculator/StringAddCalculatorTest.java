package stringaddcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAddCalculatorTest {

    @Test
    public void null_또는_빈문자() {
        assertEquals(0, StringAddCalculator.add(null));
        assertEquals(0, StringAddCalculator.add(""));
    }

    @Test
    public void add_숫자하나() {
        assertEquals(1, StringAddCalculator.add("1"));
    }

    @Test
    public void add_쉼표구분자() {
        assertEquals(5, StringAddCalculator.add("1,4"));
    }

    @Test
    public void add_쉼표또는_콜론구분자() {
        assertEquals(10, StringAddCalculator.add("1,4:5"));
    }

    @Test
    public void add_custom_구분자() {
        assertEquals(6, StringAddCalculator.add("//;\n1;2;3"));
    }

    @Test(expected = RuntimeException.class)
    public void add_negative() {
        StringAddCalculator.add("-1,2,3");
    }
}
