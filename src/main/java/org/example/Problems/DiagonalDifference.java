package org.example.Problems;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int start = 0;
        int end = arr.size()-1;
        int lr_total = 0;
        int rl_total = 0;
        for (List<Integer> list : arr) {
            lr_total += list.get(start);
            rl_total += list.get(end);
            start++;
            end--;
        }
        return Math.abs(lr_total - rl_total);
    }
}
