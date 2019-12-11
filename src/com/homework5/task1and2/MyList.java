package com.homework5.task1and2;

import java.util.ArrayList;

public class MyList<T extends Comparable<T>> {
    private ArrayList<T> array = new ArrayList<>();

    public void add(T a) {
        array.add(a);
    }

    public ArrayList<T> getArray (){
        return this.array;
    }

    public <F extends Number & Comparable<F>> F getLargestNumber(ArrayList<F> array) {

        F largest = array.get(0);
        for (int i = 0; i < array.size(); i++)
            if (array.get(i).compareTo(largest) > 0)
                largest = array.get(i);
        return largest;
    }

    public <F extends Number & Comparable<F>> F getSmallestNumber(ArrayList<F> array) {
        F smallest = array.get(0);
        for (int i = 0; i < array.size(); i++)
            if (array.get(i).compareTo(smallest) < 0)
                smallest = array.get(i);
        return smallest;
    }
}
