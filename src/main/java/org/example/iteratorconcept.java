package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class iteratorconcept {
    public static void main(String[] args) {
        System.out.println("This is iterator");


        int [] myname={10,30,23};

        Iterator it = Arrays.stream(myname).iterator()  ;
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
