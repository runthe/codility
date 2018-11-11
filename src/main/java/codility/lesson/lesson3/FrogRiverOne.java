package codility.lesson.lesson3;

/**
 * @author 김환수(hwansoo.kim \ @ navercorp.com)
 *
 */
public class FrogRiverOne {
	public static void main(String[] args) {

	}

	public static int solution(int[] A) {
		boolean[] checkArr = new boolean[A.length];

		for (int i = 0; i < checkArr.length; i++) {
			int a = A[i];

			if (a - 1 > checkArr.length - 1) {
				return 0;
			}

			checkArr[a - 1] = true;
		}

		for (boolean check : checkArr) {
			if (!check) {
				return 0;
			}
		}

		return 1;
	}
}
