package org.example.Problems;

import java.util.*;
import java.util.stream.Collectors;

public class TwoArrays {

    /**
     * The problem is if we can find a permutation of an array where A[i] + B[i] >= k
     * This algorithm takes a greedy approach to solving the two array permutation problem
     * We sort both list; one being in reserve order
     * Then we iterate though the first in natural order
     * This way when searching linearly through the second list we pull the larger numbers first
     * This make it more likely the small numbers in the first list will meet the requirement of being large than k
     * We keep iterating though the first list while removing selected elements from the second list
     * Honestly might not need the reserve order list, but I figure the algorithm searches less if it is
     * @param k the number the pairs have to be greater than
     * @param A List 1
     * @param B List 2
     * @return String "YES" if a permutation of the List exist, "NO" if not
     */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        LinkedList<Integer> sortedB = B.stream().sorted().collect(Collectors.toCollection(LinkedList::new));
        List<Integer> reverseSortedA = A.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        reverseSortedA = reverseSortedA.reversed();

        for (Integer i : reverseSortedA) {
            Integer foundMatch = null;
            for (Integer j: sortedB) {
                if (i + j >= k) {
                    foundMatch = j;
                    break;
                }
            }
            if (foundMatch == null) {
                return "NO";
            } else {
                sortedB.remove(foundMatch);
            }
        }
        return "YES";
    }
}
