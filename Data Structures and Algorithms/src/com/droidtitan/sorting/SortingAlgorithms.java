package com.droidtitan.sorting;

public class SortingAlgorithms
{
    public static void insertionSort(int[] list)
    {
	/** First number has no left. */
	for (int mainIndx = 1; mainIndx < list.length; mainIndx++)
	{
	    int currVal = list[mainIndx];
	    int indxL = mainIndx - 1;

	    /**
	     * While our currVal keeps on being smaller then its left neighbor
	     * keep on swapping until you find its place.
	     */
	    while (indxL >= 0 && list[indxL] > currVal)
	    {
		list[indxL + 1] = list[indxL];
		indxL -= 1;
	    }
	    list[indxL + 1] = currVal;
	}

    }
}
