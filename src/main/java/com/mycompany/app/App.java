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

    final String textExternal = "Text External";

    MyFunction myFunction = text -> {
      String textInternal = " Pepe";
      System.out.println(text + textInternal + textExternal);

      textInternal = " Manolo";
      System.out.println(text + textInternal);
    };

    myFunction.apply("Hello");
  }
}
