package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int INITIAL_TOTAL_REJECTED = 0;
	private int totalRejected = INITIAL_TOTAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// wiersze 5 12 14 15 były zle sformatowane
// alt <- -> odpowiednio zmieniają aktualny plik na lewy albo prawy od obecnie otwartego