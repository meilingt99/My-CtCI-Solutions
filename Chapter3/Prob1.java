public class Prob1 {
    public static void main(String[] args) throws FullStackException{
        System.out.println("Testing constructor to make an empty stack in" + 
            "which each stack has capacity 10");
        FixedMultiStacks stacks = new FixedMultiStacks(10);
        System.out.println(stacks.toString());
        System.out.println("Testing isEmpty method");
        System.out.println(stacks.isEmpty(1));
        System.out.println("Testing push method");
        stacks.push(0,1);
        System.out.println(stacks.toString());
        stacks.push(1,3);
        stacks.push(2,6);
        System.out.println(stacks.toString());
    }
}