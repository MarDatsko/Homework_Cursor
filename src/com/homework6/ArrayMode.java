package com.homework6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayMode {
    public void removeNumbers(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        System.out.println("List before remove - " + list);
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println("List after remove - " + list + "\n");
    }

    public void replaceValue(List<String> list) {
        System.out.println("List before replace - " + list);
        boolean isReplaceValue = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Orange")) {
                list.set(i, "Grapefruit");
                isReplaceValue = false;
            }
        }
        if (isReplaceValue) {
            System.out.println("That value not present" + "\n");
        }
        System.out.println("List after replace - " + list + "\n");
    }

    public <T> void checkSimilarElemant(List<T> firstList, List<T> secondList) {
        System.out.println("First list - " + firstList + "\n" + "Second list - " + secondList);
        List<T> similarElement = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i).equals(secondList.get(j))) {
                    similarElement.add(firstList.get(i));
                }
            }
        }
        if (similarElement.isEmpty()) {
            System.out.println("Similar elements not found" + "\n");
        } else {
            System.out.println("Similar elements - " + similarElement + "\n");
        }
    }
}
