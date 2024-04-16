package org.example.Problems;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (Integer i : arr) {
            if (i > 0)
                pos++;
            else if (i < 0)
                neg++;
            else
                zero++;
        }
        double pos_ratio = (double) pos / arr.size();
        double neg_ratio = (double) neg / arr.size();
        double zero_ratio = (double) zero / arr.size();

        System.out.printf("%.6f\n", pos_ratio);
        System.out.printf("%.6f\n", neg_ratio);
        System.out.printf("%.6f", zero_ratio);

    }
}
