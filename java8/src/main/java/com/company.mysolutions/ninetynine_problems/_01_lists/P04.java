package com.company.mysolutions.ninetynine_problems._01_lists;

import java.util.List;

/**
 * Created by gk on 7/4/2017.
 */
public class P04 {

    public static <T> int findLengthOfTheList(List<T> elements) {
        return elements.size();
    }

    public static <T> long findLengthOfTheListWithStream(List<T> elements) {
        return elements.stream().count();
    }

    public static <T> int findLengthOfTheListWithStreamSecond(List<T> elements) {
        return elements.stream().mapToInt(x -> 1).sum();
    }


}
