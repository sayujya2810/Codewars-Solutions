package kyu6;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.AssertJUnit.assertEquals;



public class SqInRectTest {

    @Test
    public void test1() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SqInRect.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, SqInRect.sqInRect(5, 5));
    }
}

class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        // your code

        List<Integer> a = new ArrayList<Integer>();

        if (lng == wdth) return null;
        while (lng * wdth > 0) {
            if (lng > wdth) {
                a.add(wdth);
                lng = lng - wdth;
            } else {
                a.add(lng);
                wdth = wdth - lng;
            }
        }
        return a;
    }
}
