package codility.lesson.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		int a = solution(5, new int[] {1, 2, 3, 4, 6, 5});
		System.out.println(a);
	}

	public static int solution(int X, int[] A) {
		int length = A.length;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < length; i++) {
			int a = A[i];

			if (X >= a) {
				set.add(a);

				if (X == set.size()) {
					return i;
				}
			}
		}

		return -1;
	}
}
