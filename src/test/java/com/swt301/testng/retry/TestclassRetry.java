package com.swt301.testng.retry;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.swt301.testng.listeners.InvokedMethodListener;

// @Listeners(value = InvokedMethodListener.class)
public class TestclassRetry {

    @DataProvider(name = "data-provider")
    public Object[] beforeMethod() {
        return new Object[] { new Random().nextInt(3) };
    }

    @Test(retryAnalyzer = MyRetry.class, dataProvider = "data-provider")
    public void test2(int a) {
        Assert.assertEquals(a, 1);
    }

}
