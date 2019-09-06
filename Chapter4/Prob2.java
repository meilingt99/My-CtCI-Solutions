public class Prob2 {
    public static int[] val;
        public static BinarySearchTreeNode arrayToNode(int start, int end){
            if(end-start == 0){
                return new BinarySearchTreeNode(val[start]);
            } 
            else if(end-start == 1){
                BinarySearchTreeNode node = new BinarySearchTreeNode(val[end]);
                node.left = new BinarySearchTreeNode(val[start]);
                return node;
            }
            else if(end-start == 2){
                BinarySearchTreeNode node = new BinarySearchTreeNode(val[end-1]);
                node.left = new BinarySearchTreeNode(val[start]);
                node.left = new BinarySearchTreeNode(val[end]);
                return node;
            }
            else {
                int mid = (end-start+1)/2 + start;
                BinarySearchTreeNode node = new BinarySearchTreeNode(val[mid]);
                node.left = arrayToNode(start,mid-1);
                node.right = arrayToNode(mid+1,end);
                return node;
            }
    }
    public static void printTree( BinarySearchTreeNode node ){
        if( node == null ){
            System.out.print(" end ");
        }
        else {
            System.out.print(node.value + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }
    public static void main(String[] args){
        val = new int[]{1,2,3,4,5,6,7,8,9,10};
        printTree(arrayToNode(0,val.length -1));
    }
}