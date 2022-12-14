package project01package;

// CONVERSION CHART (Condition - Number)
//  NEW = 3
//  GOOD = 2
//  POOR = 1
//  TRASHED = 0

public enum Condition {
	NEW("new"), 
	GOOD("good"), 
	POOR("poor"), 
	TRASHED("trashed");
	private final String mCond;
	Condition(String cond){
		mCond = cond;
	}
	public String toString(){ return mCond; }
	
	
	/**
	 * Converts the given condition to its numeric equivalent
	 * (Refer to conversion chart at top of file)
	 * 
	 * @param num
	 * @return Condition (that correlates to the number provided)
	 * @throws IllegalArgumentException
	 */
	public int toInt() {
		if (mCond.equals("new"))
			return 3;
		else if (mCond.equals("good"))
			return 2;
		else if (mCond.equals("poor"))
			return 1;
		else if (mCond.equals("trashed"))
			return 0;
		else // indicates something went wrong
			return -1;
	}
	
	/**
	 * Accepts an integer from 0 to 3 (inclusive) and returns the Condition equivalent
	 * (Refer to conversion chart at top of file)
	 * 
	 * @param num
	 * @return Condition (that correlates to the number provided)
	 * @throws IllegalArgumentException
	 */
	public static Condition intToCondition(int num) throws IllegalArgumentException {
		if (num == 3)
			return Condition.NEW;
		else if (num == 2)
			return Condition.GOOD;
		else if (num == 1)
			return Condition.POOR;
		else if (num == 0)
			return Condition.TRASHED;
		else
			throw new IllegalArgumentException("Integer supplied must be 0, 1, 2, or 3");
	}
}
