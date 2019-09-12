package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        ChangeArgSeq changeArgSeq = new ChangeArgSeq();
        double avg = changeArgSeq.average(10, 20.0, 30.0);
        System.out.println("Avarage of 10, 20 and 30 :: " + avg);
        avg = changeArgSeq.average(10.0, 20, 30.0);
        System.out.println("Avarage of 10, 20 and 30 :: " + avg);
        avg = changeArgSeq.average(10.0, 20.0, 30);
        System.out.println("Avarage of 10, 20 and 30 :: " + avg);
    }
}

class ChangeArgSeq {
    public double average(int a, double b, double c) {
        return (a + b + c) / 3;
    }

    public double average(double a, int b, double c) {
        return (a + b + c) / 3;
    }

    public double average(double a, double b, long c) {
        return (a + b + c) / 3;
    }
}