import org.example.Problems.MinMaxSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinMaxTest extends StandardOutTestTemplate {
    @Test
    public void TestOne() {
        String expectedResult = "10 14\r\n";
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(intArray);
        MinMaxSum.miniMaxSum(intList);
        Assert.assertEquals(expectedResult, outputStream.toString());
    }

    @Test
    public void TestTwo() {
        String expectedResult = "299 9271\r\n";
        Integer[] intArray = {7, 69, 2, 221, 8974};
        List<Integer> intList = Arrays.asList(intArray);
        MinMaxSum.miniMaxSum(intList);
        Assert.assertEquals(expectedResult, outputStream.toString());
    }
}
