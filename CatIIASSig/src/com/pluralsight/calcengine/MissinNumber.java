package com.pluralsight.calcengine;

import java.util.*;

public class MissinNumber {
    public static int[] Numbers(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i])) {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);

            } else {
                map1.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map2.containsKey(arr2[i])) {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            } else {
                map2.put(arr2[i], 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int element : map2.keySet()) {
            if (map2.containsKey(element)) {
                if (map2.get(element) > map1.get(element)) {
                    list.add(element);
                } else {
                    list.add(element);
                }
            }
            Collections.sort(list);
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }

        return arr1;
    }
}