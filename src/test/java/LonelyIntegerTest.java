import org.example.Problems.LonelyInteger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LonelyIntegerTest {
    @Test
    public void TestOne(){
        List<Integer> input = Arrays.asList(1, 1, 2);
        int result = LonelyInteger.lonelyinteger(input);
        Assert.assertEquals(2,result);
    }

    @Test
    public void TestTwo(){
        List<Integer> input = Arrays.asList(0, 0, 1, 2, 1);
        int result = LonelyInteger.lonelyinteger(input);
        Assert.assertEquals(2,result);
    }

    @Test
    public void TestThree() {
        List<Integer> input = Arrays.asList(1);
        int result = LonelyInteger.lonelyinteger(input);
        Assert.assertEquals(1,result);
    }
}
