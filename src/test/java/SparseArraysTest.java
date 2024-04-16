import org.example.Problems.SparseArrays;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SparseArraysTest {
    @Test
    public void TestOne() {
        List<String> stringArray = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queryArray = Arrays.asList("aba", "xzxb", "ab");
        List<Integer> result = SparseArrays.matchingStrings(stringArray, queryArray);
        List<Integer> expectedResult = Arrays.asList(2, 1, 0);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void TestTwo() {
        List<String> stringArray = Arrays.asList("def", "de", "fgh");
        List<String> queryArray = Arrays.asList("de", "lmn", "fgh");
        List<Integer> result = SparseArrays.matchingStrings(stringArray, queryArray);
        List<Integer> expectedResult = Arrays.asList(1, 0, 1);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void TestThree() {
        List<String> stringArray = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf");
        List<String> queryArray = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn");
        List<Integer> result = SparseArrays.matchingStrings(stringArray, queryArray);
        List<Integer> expectedResult = Arrays.asList(1, 3, 4, 3, 2);
        Assert.assertEquals(expectedResult, result);
    }
}
