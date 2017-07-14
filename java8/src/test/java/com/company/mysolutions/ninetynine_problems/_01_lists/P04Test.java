package com.company.mysolutions.ninetynine_problems._01_lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by gk on 7/4/2017.
 */
public class P04Test {

    @Test
    public void listOfEmptyListShouldBeZero() throws Exception {
        assertThat(P04.findLengthOfTheList(Collections.emptyList()), is(equalTo(0)));
    }


    @Test
    public void shouldFindLengthOfListOfNonEmptyList() throws Exception {
        assertThat(P04.findLengthOfTheList(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

    @Test
    public void listOfEmptyListShouldBeZeroCheckByStream() throws Exception {
        assertThat(P04.findLengthOfTheListWithStream(Collections.emptyList()), is(equalTo(0L)));
    }

    @Test
    public void shouldFindLengthOfListByStream() throws Exception {
        assertThat(P04.findLengthOfTheListWithStream(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5L)));
    }

    @Test
    public void listOfEmptyListShouldBeZeroCheckByStreamSecond() throws Exception {
        assertThat(P04.findLengthOfTheListWithStreamSecond(Collections.emptyList()), is(equalTo(0)));
    }

    @Test
    public void shouldFindLengthOfListByStreamSecond() throws Exception {
        assertThat(P04.findLengthOfTheListWithStreamSecond(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }


}