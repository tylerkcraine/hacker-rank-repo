package org.example.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        ArrayList<Integer> lonerList = new ArrayList<>();
        for (Integer i : a) {
            countMap.put(i, countMap.getOrDefault(i,0)+1);
            if (countMap.get(i) == 1)
                lonerList.add(i);
            else
                lonerList.remove(i);
        }
        return lonerList.getFirst();
    }
}
