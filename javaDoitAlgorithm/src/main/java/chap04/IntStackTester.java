package chap04;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack s = new IntStack(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("(1) 푸시   (2) 팝    (3) 피크    (4) 덤프    (5) 찾기    (6) 초기화   (0) 종료 : ");

			int menu = in.nextInt();
			if (menu == 0) {
				break;
			}

			int x;
			switch (menu) {
				case 1:
					System.out.print("데이터 : ");
					x = in.nextInt();
					if (s.isFull()) {
						System.out.println("스택이 가득 찼습니다.");
						break;
					}
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2:
					if (s.isEmpty()) {
						System.out.println("스택이 비어 있습니다.");
						break;
					}
					try {
						x = s.pop();
						System.out.println("pop = " + x);
					} catch (IntStack.EmtpyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 3:
					try {
						x = s.peek();
						System.out.println("peek = " + x);
					} catch (IntStack.EmtpyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 4:
					s.dump();
					break;
				case 5:
					x = in.nextInt();
					int result = s.indexOf(x);
					if (result == -1) {
						System.out.println(x + " 값은 존재하지 않습니다.");
					} else {
						System.out.println(x + " 값은 " + result + "에 위치합니다.");
					}
					break;
				case 6:
					s.clear();
					break;
			}
		}
	}
}
