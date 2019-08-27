package com.mycompany.app;

import java.util.Comparator;

public class App {
  public static void main(String[] args) {
    Comparator<String> stringComparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    };

    var comparison = stringComparator.compare("hello", "world");
    System.out.println(comparison);

    Comparator<String> stringComparatorLambda =
      (o1, o2) -> o1.compareTo(o2);

    comparison = stringComparatorLambda.compare("hello", "world");
    System.out.println(comparison);

    MyFunction myFunction = text -> System.out.println(text);

    myFunction.apply("Hello");
  }
}
