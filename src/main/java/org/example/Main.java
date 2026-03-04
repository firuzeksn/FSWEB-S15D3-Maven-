package org.example;

import org.example.entity.Employee;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    }

    public static List<Employee> findDuplicates(List<Employee> list) {
        Set<Employee> seen = new HashSet<>();
        List<Employee> duplicates = new LinkedList<>();
        if (list == null) return duplicates;

        for (Employee e : list) {
            if (e != null && !seen.add(e)) {
                duplicates.add(e);
            }
        }
        return duplicates;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> uniqueMap = new HashMap<>();
        if (list == null) return uniqueMap;

        for (Employee e : list) {
            if (e != null) {
                uniqueMap.put(e.getId(), e);
            }
        }
        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> list) {
        if (list == null) return new LinkedList<>();

        Map<Employee, Integer> counts = new HashMap<>();
        for (Employee e : list) {
            if (e != null) {
                counts.put(e, counts.getOrDefault(e, 0) + 1);
            }
        }

        List<Employee> result = new LinkedList<>();
        for (Employee e : list) {
            if (e != null && counts.get(e) == 1) {
                result.add(e);
            }
        }
        return result;
    }
}