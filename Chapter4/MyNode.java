public class MyNode {
    public String name;
    public MyNode[] children;
    public boolean visited;
    
    public MyNode(String n,MyNode[] c, boolean v){
        name = n;
        children = c;
        visited = v;
    }
}