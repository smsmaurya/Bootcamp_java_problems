package com.bridgeLab.solution.logicalPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        // Sample arrays of string values
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"cherry", "date", "grape", "kiwi", "mango"};

        // Find common elements
        String[] commonElements = findCommonElements(array1, array2);

        // Print the common elements
        System.out.println("Common elements between the arrays:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    }

    public static String[] findCommonElements(String[] array1, String[] array2) {
        ArrayList<String> commonElementsList = new ArrayList<>();

        // Convert one of the arrays to a list for easier lookup
        ArrayList<String> array2List = new ArrayList<>(Arrays.asList(array2));

        // Iterate through the first array and check if each element is in the second array
        for (String element : array1) {
            if (array2List.contains(element)) {
                commonElementsList.add(element);
            }
        }

        // Convert the ArrayList back to an array
        String[] commonElements = new String[commonElementsList.size()];
        commonElements = commonElementsList.toArray(commonElements);

        return commonElements;
    }
}

