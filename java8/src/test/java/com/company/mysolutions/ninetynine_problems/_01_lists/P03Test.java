package com.company.mysolutions.ninetynine_problems._01_lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by gk on 7/4/2017.
 */
public class P03Test {

    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(P03.findKthElement(numbers, 2), is(equalTo(3)));
    }


    @Test
    public void shouldFindKthElementStreamFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(P03.findKthElementStream(numbers, 2), is(equalTo(3)));
    }


}