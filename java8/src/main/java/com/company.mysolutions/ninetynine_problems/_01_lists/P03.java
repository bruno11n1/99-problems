package com.company.mysolutions.ninetynine_problems._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gk on 7/4/2017.
 */
public class P03 {

    public static <T> T findKthElement(final List<T> elements, final int kthElement) {
        return elements.get(kthElement);
    }

    public static <T> T findKthElementStream(final List<T> elements, final int kthElement) {
        return elements.stream()
                .limit(kthElement + 1)
                .collect(Collectors.toCollection(LinkedList::new))
                .getLast();
    }

}
