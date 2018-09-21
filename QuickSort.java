
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	public void sort(int[] array, int start, int end) {

		if (start >= end)
			return;

		int pivot = helper(array, start, end);
		sort(array, start, pivot - 1);
		sort(array, pivot + 1, end);

	}

	public static int helper(int[] array, int start, int end) {

		// choose a random number
		// { 10, 30, 21, 170, 0, 5 }
		// 0 5 10 30 21 170
		int pivot = end;
		int index = start;
		for (int i = start; i < end; i++) {

			if (array[i] <= array[pivot]) {
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
				index += 1;
			}
		}
		int temp = array[pivot];
		array[pivot] = array[index];
		array[index] = temp;
		return index;
	}

}
