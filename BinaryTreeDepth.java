public class BinaryTreeDepth {
    static class Node {
        int val;
        Node left,right;
        Node(int item){
            val=item;
            left=null;
            right=null;
        }
    }
    public static int depth(Node root){
        if (root==null){
            return 0;
        }
        int leftdepth=depth(root.left);
        int rightdepth=depth(root.right);
        return Math.max(leftdepth, rightdepth)+1;
    }
    public static void main(String[] args) {
        Node tree1=new Node(1);
        tree1.left=new Node(2);
        tree1.right=new Node(3);
        tree1.left.left=new Node(4);
        tree1.right.right=new Node(5);
        tree1.right.right.left=new Node(6);
        tree1.right.right.right=new Node(7);
        Node tree2=new Node(12);
        tree2.left=new Node(8);
        tree2.right=new Node(18);
        tree2.left.left=new Node(5);
        tree2.left.right=new Node(11);
        System.out.println("Depth of Tree1: "+depth(tree2));
        System.out.println("Depth of Tree2: "+depth(tree1));

    }
}
