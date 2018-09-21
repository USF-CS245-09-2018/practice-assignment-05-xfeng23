
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		insertionSortArray(a);
	}

	private static void insertionSortArray(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int tempIndex = i;
			while (tempIndex > 0 && value < array[tempIndex - 1]) {
				array[tempIndex] = array[tempIndex - 1];
				tempIndex = tempIndex - 1;
			}
			array[tempIndex] = value;
		}
	}

}
