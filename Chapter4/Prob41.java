import java.util.*;
public class Prob41 {
    public static Queue<MyNode> toVisit = new LinkedList<>();
    public static boolean checkPath(MyNode start, MyNode end){
        for( MyNode n : start.children ){
            if( n == end ){
                return true;
            }
            else if(!(n.visited)){
                toVisit.add(n);
            }
        }
        if( toVisit.size() == 0 ){
            return false;
        }
        else {
            checkPath(toVisit.remove(),end);
        }
        return false;
    }
    public static void main( String[] args ){
        MyNode[] n1List = {};
        MyNode n1 = new MyNode("node1",n1List,false);
        MyNode[] n2List = {n1};
        MyNode n2 = new MyNode("node2",n2List,false);
        MyNode[] n3List = {n1,n2};
        MyNode n3 = new MyNode("node3",n3List,false);
        MyNode[] n4List = {n2};
        MyNode n4 = new MyNode("node4",n4List,false);
        System.out.println(checkPath(n2,n1));
        System.out.println(checkPath(n1,n2));
        System.out.println(checkPath(n3,n1));
        System.out.println(checkPath(n3,n2));
        System.out.println(checkPath(n2,n4));
    }
}