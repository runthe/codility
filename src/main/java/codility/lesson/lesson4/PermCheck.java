package codility.lesson.lesson4;

public class PermCheck {

	public static void main(String[] args) {
		int a = solution(new int[] {4, 1, 3});
		System.out.println(a);
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
