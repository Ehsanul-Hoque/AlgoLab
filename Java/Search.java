package algoo;

import java.io.*;


class Search
{

	public static int linearSearch(int[] array, int number)
	{
		int end = array.length;

		for (int i = 0; i < end; i++) {
			if (array[i] == number)
				return i;
		}

		return -1;
	}

	public static int binarySearch(int[] array, int number)
	{
		int start = 0, end = array.length, mid;

		for ( ; end >= start; ) {
			mid = (start + end) / 2;

			if (array[mid] == number)
				return mid;
			else if (array[mid] > number)
				end = mid;
			else
				start = mid;
		}

		return -1;
	}

	public static int recursiveBinarySearch(int[] array, int start, int end, int number)
	{
		if (end < start)
			return -1;

		int mid = (start + end) / 2;

		if (array[mid] == number)
			return mid;

		else if (array[mid] > number) {
			end = mid;
			return recursiveBinarySearch(array, start, end, number);

		} else {
			start = mid;
			return recursiveBinarySearch(array, start, end, number);

		}
	}

}