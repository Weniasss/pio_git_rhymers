package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBERS_ARRAY_SIZE = 12;
	public static final int INITIAL_NUMBERS_ARRAY_SIZE = -1;
	public static final int CALLCHECK_ERROR = -1;

	private final int[] numbers = new int[NUMBERS_ARRAY_SIZE];
	public int total = INITIAL_NUMBERS_ARRAY_SIZE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == INITIAL_NUMBERS_ARRAY_SIZE;
		}
		
	public boolean isFull() {
				return total == NUMBERS_ARRAY_SIZE - 1;
			}
		
	protected int peekaboo() {
		if (callCheck())
			return CALLCHECK_ERROR;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return CALLCHECK_ERROR;
		return numbers[total--];
	}

}
