package com.homework5.task1and2;

public class ProgramRunner {
    public void runProgram() {
        MyList<Integer> myIntegerList = new MyList<>();
        MyList<Double> myDoubleList = new MyList<>();
        MyList<String> myStringList = new MyList<>();

        Integer myInt1 = 150;
        Integer myInt2 = -45;
        Integer myInt3 = 4;
        Double myDouble1 = 150.67d;
        Double myDouble2 = -45.89d;
        Double myDouble3 = 4.03d;

        myIntegerList.add(myInt1);
        myIntegerList.add(myInt2);
        myIntegerList.add(myInt3);

        myDoubleList.add(myDouble1);
        myDoubleList.add(myDouble2);
        myDoubleList.add(myDouble3);

        System.out.println('\n' + "The largest number in integer array = " + myIntegerList.getLargestNumber(myIntegerList.getList()));
        System.out.println("The smallest number in integer array = " + myIntegerList.getSmallestNumber(myIntegerList.getList()) + '\n');
        System.out.println("The largest number in double array = " + myDoubleList.getLargestNumber(myDoubleList.getList()));
        System.out.println("The smallest number in double array = " + myDoubleList.getSmallestNumber(myDoubleList.getList()));
    }
}
