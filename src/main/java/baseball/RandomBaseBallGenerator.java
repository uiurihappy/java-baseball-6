package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomBaseBallGenerator implements BaseBallGenerator {
	// StringBuilder sb가 정수 n을 포함하는지 판단한다.
	private boolean contains(StringBuilder sb, int n) {

		System.out.println(Character.forDigit(n, 10));
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == Character.forDigit(n, 10)) {
				return true;
			}
		}
		return false;
	}

	public BaseBall generate() {
		StringBuilder sb = new StringBuilder();
		while (sb.length() < 3) {
			int randomNumber = Randoms.pickNumberInRange(1, 9);
			if (!contains(sb, randomNumber)) {
//				System.out.println(sb);
//				System.out.println(randomNumber);
				sb.append(randomNumber);
			}
		}
		return new BaseBall(sb.toString());
	}
}