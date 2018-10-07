package codility.lesson.lesson1;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryGap {

	private static final String BLANK = "";

	private enum BINARY {
		ZERO("0"),
		ONE("1");

		private final String code;

		BINARY(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}
	}

	public static void main(String[] args) {
		solution(1041);
	}

	private static int solution(int n) {
		String binary = Integer.toBinaryString(n);

		if (!hasZeroBinary(binary)) {
			return 0;
		}

		String[] binaryArray = binary.split(BINARY.ONE.getCode());

		if (binary.endsWith(BINARY.ZERO.getCode())) {
			binaryArray[binaryArray.length - 1] = BLANK;
		}

		return Arrays.stream(binaryArray).filter(o -> !o.equals(BLANK)).max(Comparator.comparingInt(String::length)).orElse(BLANK).length();
	}

	private static boolean hasZeroBinary(String binary) {
		return binary.contains(BINARY.ZERO.getCode());
	}
}
