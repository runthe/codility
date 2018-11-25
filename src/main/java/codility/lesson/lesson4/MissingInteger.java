package codility.lesson.lesson4;

/**
 * @author 김환수(hwansoo.kim \ @ navercorp.com)
 *
 */
public class MissingInteger {
	public static void main(String[] args) {
		int a = solution(new int[] {1, 3, 6, 4, 1, 2});
		System.out.println(a);
	}

	public static int solution(int[] A) {
		int aLength = A.length;
		boolean checkArr[] = new boolean[aLength];

		for (int i = 0; i < aLength; i++) {
			int value = A[i];

			if (value > 0 && value <= aLength) {
				checkArr[value - 1] = true;
			}
		}

		for (int i = 0; i < aLength; i++) {
			if (!checkArr[i]) {
				return i + 1;
			}
		}

		return aLength + 1;
	}
}
