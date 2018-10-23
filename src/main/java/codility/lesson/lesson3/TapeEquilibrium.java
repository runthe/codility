package codility.lesson.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args) {
		solution(new int[] {3, 1, 2, 4, 3});
	}

	private static int solution(int[] A) {
		int aLength = A.length;
		int min = 0;
		int total = 0;
		int left = 0;
		int right = 0;

		if (aLength == 2) {
			return Math.abs(A[0] - A[1]);
		}

		//Stream으로 하면 타임복잡도 통과못함
		for (int i = 0; i < aLength; i++) {
			total += A[i];
		}

		for (int i = 1; i < aLength - 1; i++) {
			left += A[i - 1];
			right = total - left;

			int temp = Math.abs(left - right);

			if (i == 1) {
				min = temp;
			} else {
				min = Math.min(min, temp);
			}

			if (min == 0) {
				break;
			}
		}

		return min;
	}
}
