package org.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    List mk=new ArrayList();
    mk.add("jubayer");
    mk.add("hussin");
    mk.add("ow how it is work");

  Iterator it =mk.iterator();
  while (it.hasNext()){
      System.out.println(it.next());
  }


        System.out.println(mk);

        // mak= new ArrayList();
    }
}