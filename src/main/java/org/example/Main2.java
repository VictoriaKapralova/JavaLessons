package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

//for
public class Main2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(27);
        integerList.add(10);
        integerList.add(11);
        integerList.add(12);
        System.out.println(integerList.size() + " size()");

//        for (int i = 0; i < integerList.size(); i++) {
//            System.out.println(i + " - " + integerList.get(i));
//        }
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Hello");
//        stringList.add("World");
//        stringList.add("!");

//        for(String text: stringList) {
//            System.out.print(text + " ");
//        }
//        System.out.println();
//        for (int i = 0; i <stringList.size() ; i++) {
//            System.out.print(stringList.get(i)+" ");
//        }

        //while:
//        int count = 0;
//        while (count < stringList.size()) {
//            System.out.println(count + "- " + stringList.get(count));
//            count++;
//        }
//        count = 0;
//        do {
//            System.out.println(count + " - " + stringList.get(count));
//            count++;
//        }
//        while (count < stringList.size());

//even and odd
        for (Integer number : integerList) {
            if (number % 2 >0) {
                System.out.println(number % 2 + " нечетное: " + number);
            } else if (number>90) {
                System.out.println(number % 2 + " четное Большое: " + number);
            } else {
                System.out.println(number % 2 +" четное маленькое: " + number);
            }
        }

    }
}

