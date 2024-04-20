import org.example.Problems.DiagonalDifference;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDiffTest {
    @Test
    public void TestOne() {
        List<List<Integer>> param = new ArrayList<>();
        param.add(Arrays.asList(11,2,4));
        param.add(Arrays.asList(4,5,6));
        param.add(Arrays.asList(10,8,-12));
        int result = DiagonalDifference.diagonalDifference(param);
        Assert.assertEquals(15, result);
    }
}
