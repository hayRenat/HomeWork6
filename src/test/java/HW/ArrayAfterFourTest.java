package HW;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayAfterFourTest {
    private ArrayAfterFour arrayAfterFour;

@Test
    public void testArrayAfterFour(){
    Integer[] array = new Integer[] {1, 2, 3, 8, 2, 5, 4, 4 ,6};
    Integer[] trueArray = new Integer[] {6};
    Assertions.assertArrayEquals(trueArray, ArrayAfterFour.arrayAfterFour(array));
}
@Test
    public void testArrayAfterFour2(){
        Integer[] array = new Integer[] {1,3,2,1,5,4,8,9,4,4,1,5,4,8,1,5,8,4};
        Assertions.assertTrue(ArrayAfterFour.arrayAfterFour(array).length == 0);
    }
@Test
    public void testArrayAfterFour3(){
        Integer[] array = new Integer[] {4,8,5,2,4,1,5,8,4,5,4,8,5,1,4,8,4,5,3,2,1};
        Integer[] trueArray = new Integer[] {5,3,2,1};
        Assertions.assertArrayEquals(trueArray, ArrayAfterFour.arrayAfterFour(array));
    }
@Test
    public void testArrayAfterFour4(){
        Integer[] array = new Integer[] {5,6,1,5,4,1,5,6,5,6,5,5,1};
        Integer[] trueArray = new Integer[] {1,5,6,5,6,5,5,1};
        Assertions.assertArrayEquals(trueArray, ArrayAfterFour.arrayAfterFour(array));
    }
@Test
    public void exceptionTest() {
        Integer[] array = new Integer[] {1,7,8,9,6,5,6,8};
        Assertions.assertThrows(RuntimeException.class,()->ArrayAfterFour.arrayAfterFour(array));
}
}
