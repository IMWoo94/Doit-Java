package chap04;

import java.util.Scanner;

public class IntDualStackTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntDualStack s = new IntDualStack(5);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("first 스택 : (1) 푸시   (2) 팝    (3) 피크    (4) 찾기    (5) 초기화");
			System.out.println("second 스택 : (6) 푸시   (7) 팝    (8) 피크    (9) 찾기    (10) 초기화");
			System.out.println("(11) 덤프    (0) 종료 : ");

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
						s.firstPush(x);
					} catch (IntDualStack.OverflowIntDualStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 6:
					System.out.print("데이터 : ");
					x = in.nextInt();
					if (s.isFull()) {
						System.out.println("스택이 가득 찼습니다.");
						break;
					}
					try {
						s.secondPush(x);
					} catch (IntDualStack.OverflowIntDualStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2:
					if (s.isFirstEmpty()) {
						System.out.println("첫 스택이 비어 있습니다.");
						break;
					}
					try {
						x = s.firstPop();
						System.out.println("pop = " + x);
					} catch (IntDualStack.EmtpyIntDualStackException e) {
						System.out.println("첫 스택이 비어 있습니다.");
					}
					break;
				case 7:
					if (s.isSecondEmpty()) {
						System.out.println("세컨 스택이 비어 있습니다.");
						break;
					}
					try {
						x = s.secondPop();
						System.out.println("pop = " + x);
					} catch (IntDualStack.EmtpyIntDualStackException e) {
						System.out.println("세컨 스택이 비어 있습니다.");
					}
					break;
				case 3:
					try {
						x = s.firstPeek();
						System.out.println("peek = " + x);
					} catch (IntDualStack.EmtpyIntDualStackException e) {
						System.out.println("첫 스택이 비어 있습니다.");
					}
					break;
				case 8:
					try {
						x = s.secondPeek();
						System.out.println("peek = " + x);
					} catch (IntDualStack.EmtpyIntDualStackException e) {
						System.out.println("세컨 스택이 비어 있습니다.");
					}
					break;
				case 4:
					x = in.nextInt();
					int resulta = s.firstIndexOf(x);
					if (resulta == -1) {
						System.out.println(x + " 값은 존재하지 않습니다.");
					} else {
						System.out.println(x + " 값은 " + resulta + "에 위치합니다.");
					}
					break;
				case 9:
					x = in.nextInt();
					int resultb = s.secondIndexOf(x);
					if (resultb == -1) {
						System.out.println(x + " 값은 존재하지 않습니다.");
					} else {
						System.out.println(x + " 값은 " + resultb + "에 위치합니다.");
					}
					break;
				case 5:
					s.firstClear();
					break;
				case 10:
					s.secondClear();
					break;
				case 11:
					s.dump();
					break;
			}
		}
	}
}
