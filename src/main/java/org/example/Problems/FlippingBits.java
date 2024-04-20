package org.example.Problems;

public class FlippingBits {
    public static long flippingBits(long n) {
        return Long.parseUnsignedLong(Long.toBinaryString(~n).substring(32), 2);
    }
}
