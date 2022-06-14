package kyu6;
import org.testng.annotations.Test;

import java.util.*;
import java.lang.*;

import static org.testng.AssertJUnit.*;


public class TwoSumTest
{
    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = Solution.twoSum(numbers, target);
        if ( null == actual )
        {
            System.out.format("Received a null\n");
            assertNotNull(actual);
        }
        if ( actual.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");
            assertTrue(false);
        }
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
}


class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {

        int size = numbers.length;
        HashMap<Integer, Integer> holder = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        if (size < 2) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (holder.containsKey(target - numbers[i])) {
                result[0] = i;
                result[1] = holder.get(target - numbers[i]);
            }
            else {
                holder.put(numbers[i], i);    // [value, index]
            }
        }
        return result;
    }
}
