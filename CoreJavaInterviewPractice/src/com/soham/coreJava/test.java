package com.soham.coreJava;

import java.util.Arrays;

 class Ex {

    private int[] data;

    // makes a shallow copy of values
    public Ex(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println( Arrays.toString(data) );
    }
}

public class test {
    public static void main(String[] args) {
        int[] vals = {-5, 12, 0};
        Ex e = new Ex(vals);
        e.showData(); // prints out [-5, 12, 0]
        vals[0] = 1212;
        e.showData(); // prints out [13, 12, 0]
        // Very confusing, because I didn't intentionally change anything about the 
        // object e refers to.
    }
}
