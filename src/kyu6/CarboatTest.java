package kyu6;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CarboatTest {

    @Test
    public void BasicTests() {
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]",
                Carboat.howmuch(1, 100));
        assertEquals("[]",
                Carboat.howmuch(2950, 2950));
    }

}


class Carboat {

    public static String howmuch(int m, int n) {
        int min = Math.min(m, n);
        if (min < 10) min = 10;
        int max = Math.max(m, n);

        StringBuilder result = new StringBuilder("[");
        for (int i = min; i <= max; i++) {
            if ((i - 2) % 7 == 0 && (i - 1) % 9 == 0) {
                result.append("[M: ").append(i).append(" ")
                        .append("B: ").append((i - 2) / 7).append(" ")
                        .append("C: ").append((i - 1) / 9).append("]");
            }
        }
        return result.append("]").toString();
    }
}