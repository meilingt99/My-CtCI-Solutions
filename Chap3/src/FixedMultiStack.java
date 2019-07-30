public class FixedMultiStacks {
	private int numStacks = 3;
	private int stackCapacity; 
	private int[] values;
	private int[] sizes;
	
	public FixedMultiStacks(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackCapacity * numStacks];
		sizes = new int[numStacks];
	}
	
	/* push */
	public void push(int stackNum, int value) throws FullStackException {
		if (isFull(stackNum)) {
			raise new FullStackException();
		}
		else {
			sizes[stackNum]++;
			values[indexOfTop(stackNum)] = value;
		}
	}
	
	/* pop */
	public int pop(int stackNum) {
		if (isFull(stackNum)) {
			raise new FullStackException();
		}
		else {
			int topIndex = indexOfTop(stackNum);
			int topValue = values[topIndex];
			values[topIndex] = 0;
			sizes[stackNum]--;
			return topValue;
		}
	}
	
	/* peek */
	public int peek(int stackNum) {
		if (isFull(stackNum)) {
			raise new FullStackException();
		}
		else {
			return values[indexOfTop(stackNum)];	
		}
	}
	
	/* isEmpty */
	public boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0;
	}
	
	/* isFull */
	public boolean isFull(int stackNum) {
		return sizes[stackNum] == stackCapacity;
	}
	
	/* indexOfTop */
	public int indexOfTop(int stackNum) {
		return sizes[stackNum];
	}
}