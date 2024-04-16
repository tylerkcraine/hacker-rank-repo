package org.example.Problems;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int endIndex = arr.size()-1;
        long min = 0;
        long max = 0;

        for (int i = 0; i <= 3; i++) {
            min += arr.get(i);
            max += arr.get(endIndex-i);
        }
        System.out.println(min + " " + max);
    }
}
