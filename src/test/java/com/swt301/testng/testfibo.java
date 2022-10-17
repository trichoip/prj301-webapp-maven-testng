package com.swt301.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swt301.testng.fibo.FibonacciExample;

public class testfibo {

    @Test
    public void test() {
        Assert.assertEquals(55, FibonacciExample.fibonacci(10));
    }

}
