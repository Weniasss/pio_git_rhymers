package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS_ARRAY_SIZE = 12;
	private static final int INITIAL_NUMBERS_ARRAY_SIZE = -1;
	private static final int CALLCHECK_ERROR = -1;

	private final int[] numbers = new int[NUMBERS_ARRAY_SIZE];
	private int total = INITIAL_NUMBERS_ARRAY_SIZE;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}


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
