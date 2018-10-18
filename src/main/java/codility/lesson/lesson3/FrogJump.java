package codility.lesson.lesson3;

public class FrogJump {

	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}

	public static int solution(int X, int Y, int D) {
		int quotient = (Y - X) / D;
		int remainder = (Y - X) % D;

		return remainder == 0 ? quotient : quotient + 1;
	}
}
