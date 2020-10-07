import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem2Test {

    int [] test1 = new int[]{3, 5, 1, 6, 8, 3};
    int [] test2 = new int[]{1, 5, 3, 7, 5, 9};
    int [] test3 = new int[]{3, 5, 1, 2, 5, 7};
    int [] test4 = new int[]{1, 3, 5, 7, 8, 9};

    @Test
    public void testBubbleSort() {

        //assertTrue(false);

        int inputs[][] = {
                {},
                {3},
                {3, 5, 1, 6, 8, 3},
                {1, 5, 3, 7, 5, 9},
                {3, 5, 1, 2, 5, 7},
                {1, 3, 5, 7, 8, 9},
                {2, 3, 1, 6, 5, 8, 9},
        };

        int answer[][] = {
                {},
                {3},
                {1, 3, 3, 5, 6, 8},
                {1, 3, 5, 5, 7, 9},
                {1, 2, 3, 5, 5, 7},
                {1, 3, 5, 7, 8, 9},
                {1, 2, 3, 5, 6, 8, 9},
        };

        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int[] actual = Problem2.bubbleSort(inputs[i]);
            int[] expected = answer[i];
            assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        }
    }
}
