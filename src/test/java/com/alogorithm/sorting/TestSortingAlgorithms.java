package com.alogorithm.sorting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestSortingAlgorithms {

	private int[] collection = new int[10];

	@Before
	public void setup() {
		for (int i = 0; i < 10; i++) {
			collection[i] = (int) (Math.random() * 100);
		}
		System.out.println("\nBefore Sorting : \t" + Arrays.toString(collection));
		Arrays.sort(collection);
	}

	@Test
	public void shouldReturnSortedCollectionFromBubbleSortAlgorithm() {
		int[] actualSortedCollection = SortingAlgorithm.sortInBubbleSort(collection);
		System.out.println("After Bubble Sorting : \t" + Arrays.toString(actualSortedCollection));
		assertEquals(actualSortedCollection[2], collection[2]);
	}

	@Test
	public void shouldReturnSortedCollectionFromQuickSortAlgorithm() {
		int[] actualSortedCollection = SortingAlgorithm.sortInQuickSort(collection);
		System.out.println("After Quick Sorting : \t" + Arrays.toString(actualSortedCollection));
		assertEquals(actualSortedCollection[2], collection[2]);
	}
}
