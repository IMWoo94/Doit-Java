package chap02;

public class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0; // 찾은 소수의 갯수
		int[] prime = new int[500]; // 소수 저장 배열

		prime[ptr++] = 2; // 2는 소수 임으로 등록
		prime[ptr++] = 3; // 3는 소수 임으로 등록

		// n+=2 를 하는 이유는 짝수는 검사할 필요가 없기 때문
		// 짝수는 2로 인해서 이미 소수가 아니다
		for (int n = 5; n <= 1000; n += 2) {
			boolean flag = false;

			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) { // 마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n; // 소수라고 배열에 저장
				counter++;
			}
		}
		for (int i : prime) {
			System.out.println("i = " + i);
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
