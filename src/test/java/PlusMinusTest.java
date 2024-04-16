import org.example.Problems.PlusMinus;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PlusMinusTest extends StandardOutTestTemplate {
    @Test
    public void TestOne() {
        String expectedResult = """
                0.500000
                0.333333
                0.166667""";
        Integer[] intArray = {-4,3,-9,0,4,1};
        List<Integer> intList = Arrays.asList(intArray);
        PlusMinus.plusMinus(intList);
        Assert.assertEquals(expectedResult, this.outputStream.toString());
    }

    @Test
    public void TestTwo() {
        String expectedResult = """
                0.375000
                0.375000
                0.250000""";
        Integer[] intArray = {1,2,3,-1,-2,-3,0,0};
        List<Integer> intList = Arrays.asList(intArray);
        PlusMinus.plusMinus(intList);
        Assert.assertEquals(expectedResult, this.outputStream.toString());
    }

}
