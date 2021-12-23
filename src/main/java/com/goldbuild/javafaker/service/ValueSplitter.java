package com.goldbuild.javafaker.service;

public class ValueSplitter {

    public static String valueSplitter (String valueToSplit, int part){

        String[] parts = valueToSplit.split(":");
        if (part == 1) {
            return parts[1];
        }else {
            return parts[0];
        }
    }
}
