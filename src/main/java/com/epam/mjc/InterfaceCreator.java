package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> list = new ArrayList<>();
        return x-> {
            for (Integer i: x) {
                list.add(i/divider);
            }
            return list;
        };
    }
}
