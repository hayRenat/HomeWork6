package HW;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class OneOrFourInTheArrayTest {
    private OneOrFourInTheArray oneOrFourInTheArray;

@Test
    public void testOneOrFourInTheArray(){
        Integer[] trueArray = new Integer[]{1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(oneOrFourInTheArray.oneOrFourInTheArray(trueArray));
    }

    @Test
    public void testOneOrFourInTheArray2(){
        Integer[] integers = new Integer[]{1,1,1,1,1,1,1,1,1,1,1,1};
        Assertions.assertFalse(oneOrFourInTheArray.oneOrFourInTheArray(integers));
    }

    @Test
    public void testOneOrFourInTheArray3(){
        Integer[] integers = new Integer[]{4,4,4,4,4,4,4,4,4,4};
        Assertions.assertFalse(oneOrFourInTheArray.oneOrFourInTheArray(integers));
    }

    @Test
    public void testOneOrFourInTheArray4(){
        Integer[] integers = new Integer[]{1,4,4,1,4,1,4,5,1,4,1,4,1,4,1,4};
        Assertions.assertFalse(oneOrFourInTheArray.oneOrFourInTheArray(integers));
    }
}
