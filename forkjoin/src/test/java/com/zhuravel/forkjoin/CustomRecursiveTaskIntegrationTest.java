package com.zhuravel.forkjoin;

import com.zhuravel.forkjoin.Util.PoolUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CustomRecursiveTaskIntegrationTest {

    private int[] arr;
    private CustomRecursiveTask customRecursiveTask;

    @Before
    public void init() {
        Random random = new Random();
        arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(35);
        }
        customRecursiveTask = new CustomRecursiveTask(arr);
    }

    @Test
    public void callPoolUtil_whenExistsAndExpectedType_thenCorrect() {
        ForkJoinPool forkJoinPool = PoolUtil.forkJoinPool;
        ForkJoinPool forkJoinPoolTwo = PoolUtil.forkJoinPool;

        assertNotNull(forkJoinPool);
        assertEquals(2, forkJoinPool.getParallelism());
        assertEquals(forkJoinPool, forkJoinPoolTwo);
    }

    @Test
    public void callCommonPool_whenExistsAndExpectedType_thenCorrect() {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        ForkJoinPool commonPoolTwo = ForkJoinPool.commonPool();

        assertNotNull(commonPool);
        assertEquals(commonPool, commonPoolTwo);
    }

    @Test
    public void executeRecursiveTask_whenExecuted_thenCorrect() {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        forkJoinPool.execute(customRecursiveTask);
        customRecursiveTask.join();
        assertTrue(customRecursiveTask.isDone());

        forkJoinPool.submit(customRecursiveTask);
        customRecursiveTask.join();
        assertTrue(customRecursiveTask.isDone());
    }

    @Test
    public void executeRecursiveTaskWithFJ_whenExecuted_thenCorrect() {
        CustomRecursiveTask customRecursiveTaskFirst = new CustomRecursiveTask(arr);
        CustomRecursiveTask customRecursiveTaskSecond = new CustomRecursiveTask(arr);
        CustomRecursiveTask customRecursiveTaskLast = new CustomRecursiveTask(arr);

        customRecursiveTaskFirst.fork();
        customRecursiveTaskSecond.fork();
        customRecursiveTaskLast.fork();

        int result = 0;

        result += customRecursiveTaskFirst.join();
        result += customRecursiveTaskSecond.join();
        result += customRecursiveTaskLast.join();

        assertTrue(customRecursiveTaskFirst.isDone());
        assertTrue(customRecursiveTaskSecond.isDone());
        assertTrue(customRecursiveTaskLast.isDone());
        assertTrue(result != 0);
    }
}
