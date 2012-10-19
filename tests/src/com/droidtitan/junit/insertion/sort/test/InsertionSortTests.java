package com.droidtitan.junit.insertion.sort.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import com.droidtitan.sorting.SortingAlgorithms;

public class InsertionSortTests
{
    @Test
    public void testInsertionSort()
    {
	int[] testArray = genRandomIntArray(100);
	int[] sortedCopy = Arrays.copyOf(testArray, testArray.length);

	/** Sorted using established Array class. */
	Arrays.sort(sortedCopy);

	/** My InsertionSort Algorithm */
	SortingAlgorithms.insertionSort(testArray);

	assertArrayEquals(sortedCopy, testArray);
    }

    public int[] genRandomIntArray(int size)
    {
	Random random = new Random();
	int[] randList = new int[size];
	for (int j = 0; j < size; j++)
	{
	    randList[j] = random.nextInt();
	}

	return randList;
    }
}
