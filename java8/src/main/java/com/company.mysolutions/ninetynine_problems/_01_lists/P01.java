package com.company.mysolutions.ninetynine_problems._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by gk on 7/3/2017.
 */
public class P01 {

    public static <T> T findLastElement(List<T> elements) {
        if (elements == null && elements.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            int sizeOfElements = elements.size();
            return elements.get(sizeOfElements - 1);
        }
    }

    public static <T> T findLastElement(LinkedList<T> elements) {
        return elements.getLast();
    }

}
