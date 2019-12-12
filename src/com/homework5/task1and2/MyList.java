package com.homework5.task1and2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> array = new ArrayList<>();

    public void add(T a) {
        array.add(a);
    }

    public List<T> getList() {
        return this.array;
    }

    public <F extends Number & Comparable<F>> F getLargestNumber(List<F> array) {
        F largest = null;
        if (array.isEmpty()) {
            System.out.println("Your array is empty");
        } else {
            largest = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).compareTo(largest) > 0) {
                    largest = array.get(i);
                }
            }
        }
        return largest;
    }

    public <F extends Number & Comparable<F>> F getSmallestNumber(List<F> array) {
        F smallest = null;
        if (array.isEmpty()) {
            System.out.println("Your array is empty");
        } else {
            smallest = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).compareTo(smallest) < 0) {
                    smallest = array.get(i);
                }
            }
        }
        return smallest;
    }
}
