package kyu8;


// TODO: Replace examples and use TDD development by writing your own tests

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void fixedTests() {
        assertEquals(7, Kata.oddCount(15));
        assertEquals(7511, Kata.oddCount(15023));
    }
}

class Kata {

    public static int oddCount(int n){

        return n/2;
    }

}