package com.stackroute.javapractice2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question5Test {
    Question5 question5;

    @Before
    public void setUp() throws Exception {
        question5=new Question5();
    }

    @After
    public void tearDown() throws Exception {
        question5=null;
    }

    @Test
    public void average() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,question5.average(inputArray));
        assertNotEquals(100,question5.average(inputArray));
    }
    @Test
    public void averageExceeded() {
        int inputArray[]={25,25,101,25};
        assertNotNull("Null is not Expected!",question5.average(inputArray));
    }

    @Test
    public void lowest() {
        int inputArray[]={49,33,34,57};
        assertEquals(33,question5.lowest(inputArray));
        assertNotEquals(49,question5.lowest(inputArray));
    }

    @Test
    public void highest() {
        int inputArray[]={241,243,2504,294};
        assertEquals(2504,question5.highest(inputArray));
        assertNotEquals(294,question5.highest(inputArray));
    }
}