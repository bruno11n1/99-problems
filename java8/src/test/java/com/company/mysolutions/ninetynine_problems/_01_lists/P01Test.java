package com.company.mysolutions.ninetynine_problems._01_lists;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gk on 7/3/2017.
 */
public class P01Test {

    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        assertThat(P01.findLastElement(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    @Test
    public void shouldFindLastElementFromAListOfAlphabetsWithUsingLinkedList() throws Exception {
        assertThat(P01.findLastElement(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

}