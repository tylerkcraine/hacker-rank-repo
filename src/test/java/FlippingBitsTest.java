import org.example.Problems.FlippingBits;
import org.junit.Assert;
import org.junit.Test;

public class FlippingBitsTest {
    @Test
    public void TestZero() {
        long result1 = FlippingBits.flippingBits(2147483647);
        long result2 = FlippingBits.flippingBits(1);
        long result3 = FlippingBits.flippingBits(0);
        Assert.assertEquals(2147483648L, result1);
        Assert.assertEquals(4294967294L, result2);
        Assert.assertEquals(4294967295L, result3);
    }

    @Test
    public void TestTen() {
        long result1 = FlippingBits.flippingBits(4);
        Assert.assertEquals(4294967291L, result1);
        long result2 = FlippingBits.flippingBits(123456);
        Assert.assertEquals(4294843839L, result2);
    }

    @Test
    public void TestEleven() {
        long result1 = FlippingBits.flippingBits(0);
        long result2 = FlippingBits.flippingBits(802743475);
        long result3 = FlippingBits.flippingBits(35601423);
        Assert.assertEquals(4294967295L, result1);
        Assert.assertEquals(3492223820L, result2);
        Assert.assertEquals(4259365872L, result3);
    }
}
