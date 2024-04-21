package org.example.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> freqList = new ArrayList<>(Collections.nCopies(100,0));
        for (Integer i : arr) {
            int lastValue = freqList.get(i);
            freqList.set(i, ++lastValue);
        }
        return freqList;
    }
}
