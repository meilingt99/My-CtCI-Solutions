// minValue is an instance variable - 
// push: every pushed value is checked against the current min
// pop: if the popped value is the current minValue, queue is 
public class StackWithMin {
    private int currentIndex = 0;
    private int[] stack;
    private int minValue; // look up int value max later
    
    public StackWithMin(int stackCapacity){
        stack = new int[stackCapacity];
    }
    
    public void push(int element){
        if( currentIndex == 0 ){
            minValue = element;
        }
        else if( element < minValue ){
            minValue = element;
        }
        stack[currentIndex++] = element;
    }
    
    public int pop(){
        int popped = stack[currentIndex--];
        if( popped == minValue ){
            if(isEmpty()){
                minValue = 1000000;
            }
            else{
                int tempMin = stack[0];
                for(int i = 1; i <= currentIndex; i++){
                    if( stack[i] < tempMin){
                        tempMin = stack[i];
                    }
                }
                minValue = tempMin;
            }
        }
        return popped;
    }
    
    public int top(){
        return stack[currentIndex];
    }
    
    public int min(){
        if( isEmpty() ){
            
        }
    }
    
    public boolean isFull(){
        return currentIndex == stack.length;
    }
    
    public boolean isEmpty(){
        return currentIndex == 0;
    }
}