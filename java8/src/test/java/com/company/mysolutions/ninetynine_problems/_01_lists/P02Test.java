package com.company.mysolutions.ninetynine_problems._01_lists;

import org.junit.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by gk on 7/3/2017.
 */
public class P02Test {


    @Test(expected = NoSuchElementException.class)
    public void shouldFindSecondFinalElementFromAList() throws Exception {
        List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
        assertThat(P02.findSecondFinalElement(numbers), is(equalTo(10)));
    }


}