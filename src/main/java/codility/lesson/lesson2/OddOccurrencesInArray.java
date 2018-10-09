package codility.lesson.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int a = solution(new int[] {9, 3, 9, 3, 9, 7, 9});
		System.out.println(a);
	}

	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<>();

		for (int a : A) {
			if (!set.add(a)) {
				set.remove(a);
			}
		}

		return set.iterator().next();
	}
}
