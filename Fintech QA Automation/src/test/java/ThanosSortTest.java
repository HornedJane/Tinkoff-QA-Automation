import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.fintech.qa.thanosSort.MainThanosSort;

public class ThanosSortTest {

    @Test
    public void positivesSortTest() {
        int[] array = {2, 3, 1, 5, 4};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void negativesSortTest() {
        int[] array = {-2, -3, -1, -5, -4};
        int[] expectedResult = {-5, -4, -3, -2, -1};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void integersSortTest() {
        int[] array = {0, -5, 2, 14, -6, -8, 12, -2};
        int[] expectedResult = {-8, -6, -5, -2, 0, 2, 12, 14};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void oddLengthSortTest() {
        int[] array = {0, -5, 2, 14, -6};
        int[] expectedResult = {-6, -5, 0, 2, 14};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void evenLengthSortTest() {
        int[] array = {0, -5, 2, 14, -6, -8};
        int[] expectedResult = {-8, -6, -5, 0, 2, 14};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void equalsSortTest() {
        int[] array = {2, -2, -2, 2, -2, 0, 2, -2, -2};
        int[] expectedResult = {-2, -2, -2, -2, -2, 0, 2, 2, 2};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void allEqualsSortTest() {
        int[] array = {-13, -13, -13, -13};
        int[] expectedResult = {-13, -13, -13, -13};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void singleSortTest() {
        int[] array = {7};
        int[] expectedResult = {7};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void emptySortTest() {
        int[] array = {};
        int[] expectedResult = {};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    //int -2,147,483,648 to 2,147,483,647
    @Test
    public void criticalValuesSortTest() {
        int[] array = {-2147483648, 2147483647, 2147483647, -2147483648, -2147483648};
        int[] expectedResult = {-2147483648, -2147483648, -2147483648, 2147483647, 2147483647};
        int[] result = MainThanosSort.snapMyFingers(array);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
