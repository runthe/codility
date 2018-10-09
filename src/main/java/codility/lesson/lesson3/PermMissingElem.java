package codility.lesson.lesson3;

public class PermMissingElem {

	public static void main(String[] args) {
		int a = solution(new int[] {1, 2, 3, 5});
		System.out.println(a);
	}

	public static int solution(int[] A) {
		boolean[] checkArr = new boolean[A.length + 1];
		int checkArrLength = checkArr.length;

		for (int a : A) {
			checkArr[a - 1] = true;
		}

		for (int i = 0; i < checkArrLength; i++) {
			if (!checkArr[i]) {
				return i + 1;
			}
		}

		return 0;
	}
}
