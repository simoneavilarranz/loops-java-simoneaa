package com.loops.maven;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable implements TableInterface {

    public MultiplicationTable() {

    }

    public List<String> createTable(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
         
            result.add(n + " x " + i + " = " + (n*i));

        }

        return result;

    }

}
