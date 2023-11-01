package chap04;

public class IntDualStack {
	private int max;    // 스택 용량
	private int first_ptr;    // 스택 포인터
	private int second_ptr;
	private int[] stk;    // 스택 본체

	// 실행 시 예외 : 스택이 비어 있음
	public class EmtpyIntDualStackException extends RuntimeException {
		public EmtpyIntDualStackException() {
		}
	}

	// 스택이 가득 참
	public class OverflowIntDualStackException extends RuntimeException {
		public OverflowIntDualStackException() {
		}
	}

	public IntDualStack(int capacity) {
		first_ptr = 0;
		second_ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int firstPush(int x) throws OverflowIntDualStackException {
		if (first_ptr + second_ptr >= max) {
			throw new OverflowIntDualStackException();
		}
		return stk[first_ptr++] = x;
	}

	public int secondPush(int x) throws OverflowIntDualStackException {
		if (second_ptr + first_ptr >= max) {
			throw new OverflowIntDualStackException();
		}
		return stk[max - 1 - second_ptr++] = x;
	}

	public int firstPop() throws EmtpyIntDualStackException {
		if (first_ptr <= 0) {
			throw new EmtpyIntDualStackException();
		}
		return stk[--first_ptr];
	}

	public int secondPop() throws EmtpyIntDualStackException {
		if (second_ptr <= 0) {
			throw new EmtpyIntDualStackException();
		}
		--second_ptr;
		return stk[max - second_ptr - 1];
	}

	public int firstPeek() throws EmtpyIntDualStackException {
		if (first_ptr <= 0) {
			throw new EmtpyIntDualStackException();
		}
		return stk[first_ptr - 1];
	}

	public int secondPeek() throws EmtpyIntDualStackException {
		if (second_ptr <= 0) {
			throw new EmtpyIntDualStackException();
		}
		return stk[max - second_ptr];
	}

	public int firstIndexOf(int x) {
		for (int i = first_ptr - 1; i >= 0; i--) {
			if (stk[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public int secondIndexOf(int x) {
		for (int i = second_ptr; i >= 0; i++) {
			if (stk[max - i] == x) {
				return i;
			}
		}
		return -1;
	}

	public void firstClear() {
		first_ptr = 0;
	}

	public void secondClear() {
		second_ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return first_ptr + second_ptr;
	}

	public boolean isFirstEmpty() {
		return first_ptr <= 0;
	}

	public boolean isSecondEmpty() {
		return second_ptr <= 0;
	}

	public boolean isFull() {
		return first_ptr + second_ptr >= max;
	}

	public void dump() {
		if (first_ptr <= 0) {
			System.out.println("첫번째 스택이 비어 있습니다.");
		} else {
			System.out.println("첫번째 스택");
			for (int i = first_ptr - 1; i >= 0; i--) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
		if (second_ptr <= 0) {
			System.out.println("두번째 스택이 비어 있습니다.");
		} else {
			System.out.println("두번째 스택");
			for (int i = second_ptr - 1; i >= 0; i--) {
				System.out.print(stk[max - 1 - i] + " ");
			}
			System.out.println();
		}
	}
}
