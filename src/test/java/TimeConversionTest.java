import org.example.Problems.TimeConversion;
import org.junit.Assert;
import org.junit.Test;

public class TimeConversionTest {
    @Test
    public void TestOne() {
        String inputString = "07:05:45PM";
        String result = TimeConversion.timeConversion(inputString);
        Assert.assertEquals("19:05:45", result);
    }

    @Test
    public void TestTwo() {
        String inputString = "12:40:22AM";
        String result = TimeConversion.timeConversion(inputString);
        Assert.assertEquals("00:40:22", result);
    }

    @Test
    public void TestThree() {
        String inputString = "12:40:22PM";
        String result = TimeConversion.timeConversion(inputString);
        Assert.assertEquals("12:40:22PM", result);
    }
}
