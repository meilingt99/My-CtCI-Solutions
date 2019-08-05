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
	public void push(int stackNum, int value) throws FullStackException{
		if (isFull(stackNum)) {
			throw new FullStackException("Stack " + stackNum + " is full.");
		}
		else {
			sizes[stackNum]++;
			System.out.println(indexOfTop(stackNum) + ": " + value);
			values[indexOfTop(stackNum)] = value;
		}
	}
	
	/* pop */
	public int pop(int stackNum) throws FullStackException{
		if (isFull(stackNum)) {
			throw new FullStackException("Stack " + stackNum + " is full.");
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
	public int peek(int stackNum) throws FullStackException{
		if (isFull(stackNum)) {
			throw new FullStackException("Stack " + stackNum + " is full.");
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
	
	public String toString(){
	    String str = new String("");
	    for(int i = 0; i < 3; i++){
	        str += "\nStack " + i + ": ";
	        for(int j = 0; j < sizes[i]; j++){
	            str = str + values[j] + " ";
	        }
	    }
	    return str;
	}
}