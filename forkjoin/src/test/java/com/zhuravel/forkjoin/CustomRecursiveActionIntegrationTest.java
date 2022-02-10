package com.zhuravel.forkjoin;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;

import static org.junit.Assert.assertTrue;

public class CustomRecursiveActionIntegrationTest {

    @Test
    public void executeRecursiveAction_whenExecuted_thenCorrect() {
        CustomRecursiveAction myRecursiveAction = new CustomRecursiveAction("123456789abcdefg");
        ForkJoinPool.commonPool().invoke(myRecursiveAction);

        assertTrue(myRecursiveAction.isDone());
    }
}
