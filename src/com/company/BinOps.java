package com.company;

public class BinOps {

    public String sum(String a, String b) {
        int x1 = Integer.parseInt(a, 2);
        int x2 = Integer.parseInt(b, 2);
        int x = x1 + x2;
        return Integer.toBinaryString(x);
    }

    public String mult(String a, String b) {
        int x1 = Integer.parseInt(a, 2);
        int x2 = Integer.parseInt(b, 2);
        int x = x1 * x2;
        return Integer.toBinaryString(x);
    }
}
