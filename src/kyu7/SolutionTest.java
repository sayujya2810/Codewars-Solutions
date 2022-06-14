package kyu7;
import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
//import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void validPins() {
        assertEquals(true, Solution.validatePin("1234"));
        assertEquals(true, Solution.validatePin("0000"));
        assertEquals(true, Solution.validatePin("1111"));
        assertEquals(true, Solution.validatePin("123456"));
        assertEquals(true, Solution.validatePin("098765"));
        assertEquals(true, Solution.validatePin("000000"));
        assertEquals(true, Solution.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, Solution.validatePin("a234"));
        assertEquals(false, Solution.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, Solution.validatePin("1"));
        assertEquals(false, Solution.validatePin("12"));
        assertEquals(false, Solution.validatePin("123"));
        assertEquals(false, Solution.validatePin("12345"));
        assertEquals(false, Solution.validatePin("1234567"));
        assertEquals(false, Solution.validatePin("-1234"));
        assertEquals(false, Solution.validatePin("1.234"));
        assertEquals(false, Solution.validatePin("00000000"));
    }
}

class Solution {

    public static boolean validatePin(String pin) {
        // Your code here...
        boolean result = (pin.length() == 4 || pin.length() == 6  ) && (Pattern.matches("^[0-9]*$", pin)) ?  true : false;
        return result;
    }

}