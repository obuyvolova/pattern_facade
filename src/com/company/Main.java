package com.company;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("The sum is " + bins.sum("0101", "10"));
        System.out.println("The mult is " + bins.mult("0101", "10"));
    }
}
