package tests;

public class QuickSortTest {

	public static void main(String[] args) {
			for (int i = 0; i < 50; i++) {
				int[] vector = vectorGenerator(30);
				quickSort(vector, 0, vector.length - 1);
				System.out.println();
				showVector(vector);
				System.out.println();
			}
	}

	public static int[] vectorGenerator(int length) {
		int[] vector = new int[length];
		for (int i = 0; i < length; i++) {
			vector[i] = (int) (Math.random() * length);
		}
		return vector;
	}

	public static void quickSort(int[] vector, int leftLimit, int rightLimit) {
		int pivot = vector[rightLimit];
		int hostal = 0;
		int j = leftLimit - 1;
		for (int i = j + 1; i < rightLimit; i++) {
			if (vector[i] <= pivot) {
				j++;
				hostal = vector[j];
				vector[j] = vector[i];
				vector[i] = hostal;
			}
		}
		hostal = vector[j + 1];
		vector[j + 1] = vector[rightLimit];
		vector[rightLimit] = hostal;
		if (j > leftLimit) {
			quickSort(vector, leftLimit, j);
		}
		if ( j + 2  < rightLimit) {
			quickSort(vector, j+2, rightLimit);
		}
	}

	public static void showVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + ", ");
		}
	}

}
