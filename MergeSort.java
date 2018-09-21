
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array) {

		if (array.length < 2)
			return;
		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		for (int i = mid; i < array.length; i++) {
			right[i - mid] = array[i];
		}
		// int[] array = { 10, 30, 21, 170, 0, 5 };
		sort(left);
		sort(right);
		helper(array, left, right);
	}

	public static void helper(int[] array, int[] left, int[] right) {

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i = i + 1;
			} else {
				array[k] = right[j];
				j = j + 1;
			}
			k = k + 1;
		}
		while (i < left.length) {
			array[k] = left[i];
			i = i + 1;
			k = k + 1;
		}
		while (j < right.length) {
			array[k] = right[j];
			j = j + 1;
			k = k + 1;
		}
	}

}
