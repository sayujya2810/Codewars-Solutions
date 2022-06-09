package kyu7;

import org.testng.annotations.Test;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {
    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), Diamond.print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, Diamond.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, Diamond.print(-2));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, Diamond.print(2));
    }
}

class Diamond {
    public static String print(int n) {
        // TODO your code here
        if ((n % 2) == 0 || n <= 0) return null;
        StringBuilder diamond = new StringBuilder();
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) diamond.append(" ");
            for (int k = 0; k < i; k++) diamond.append("*");
            diamond.append("\n");
        }
        for (int i = n; i > 0; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) diamond.append(" ");
            for (int k = 0; k < i; k++) diamond.append("*");
            diamond.append("\n");
        }
        return diamond.toString();
    }
}