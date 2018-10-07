package codility.lesson.lesson2;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] a = solution(new int[] {3, 8, 9, 7, 6, 1, 2, 3,}, 2);

		Arrays.stream(a).forEach(System.out::print);
	}

	private static int[] solution(int[] A, int K) {
		int length = A.length;

		if (A.length == 0 || K % length == 0) {
			return A;
		}

		if (Arrays.stream(A).distinct().count() == 1) {
			return A;
		}

		int[] shiftedArray = new int[length];

		for (int i = 0; i < length; i++) {
			int shiftedIndex = calculateShiftedIndex(i, length, K);
			shiftedArray[shiftedIndex] = A[i];
		}

		return shiftedArray;
	}

	private static int calculateShiftedIndex(int index, int length, int times) {
		int shiftedIndex = 0;

		do {
			shiftedIndex = shiftedIndex == 0 ? (index + times) % length : shiftedIndex % length;
		} while (shiftedIndex > (length - 1));

		return shiftedIndex;
	}
}
