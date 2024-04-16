package org.example.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0)+1);
        }

        ArrayList<Integer> countList = new ArrayList<>();
        for (String s : queries) {
            countList.add(countMap.getOrDefault(s,0));
        }

        return countList;
    }
}
