package com.company.mysolutions.ninetynine_problems._01_lists;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by gk on 7/3/2017.
 */
public class P02 {

    public static <T> T findSecondFinalElement(List<T> elements) {
        if (elements.size() < 2) {
            throw new NoSuchElementException("Size of list to small, the minimum size of ;list must be greater than 3");
        } else {
            int secondLastElement = elements.size() - 2;
            return elements.get(secondLastElement);
        }
    }
}
