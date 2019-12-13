package com.homework6;

import java.util.*;

public class ProgramRunner {
    public void runProgram (){
        ArrayMode arrayMode = new ArrayMode();

        ArrayList<Integer> myListInteger = new ArrayList<>();
        myListInteger.add(3);
        myListInteger.add(9);
        myListInteger.add(11);
        myListInteger.add(18);
        myListInteger.add(20);
        myListInteger.add(22);
        myListInteger.add(15);
        myListInteger.add(21);
        myListInteger.add(27);
        myListInteger.add(24);
        arrayMode.removeNumbers(myListInteger);

        List<String> myListString = new ArrayList<>();
        myListString.add("Orange");
        myListString.add("Apricots");
        myListString.add("Banana");
        myListString.add("Orange");
        myListString.add("Avocado");
        myListString.add("Blackberries");
        myListString.add("Apple");
        arrayMode.replaceValue(myListString);

        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        firstList.add("c");
        firstList.add("b");
        firstList.add("a");
        firstList.add("d");
        firstList.add("e");
        firstList.add("t");
        secondList.add("c");
        secondList.add("g");
        secondList.add("g");
        secondList.add("g");
        secondList.add("a");
        secondList.add("t");
        arrayMode.checkSimilarElemant(firstList, secondList);

        Set<Integer> firstMethod = new TreeSet<>(Comparator.reverseOrder());
        firstMethod.add(3);
        firstMethod.add(9);
        firstMethod.add(11);
        firstMethod.add(18);
        firstMethod.add(20);
        firstMethod.add(22);
        firstMethod.add(15);
        System.out.println("Sort in DESC - " + firstMethod);

        Set<Integer> secondMethod = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2.compareTo(o1);
            }
        });
        secondMethod.add(3);
        secondMethod.add(9);
        secondMethod.add(11);
        secondMethod.add(18);
        secondMethod.add(20);
        secondMethod.add(22);
        secondMethod.add(15);
        System.out.println("Sort in DESC - " + secondMethod);
    }
}
