import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    int value;
    TreeNode left,right;
    public TreeNode(int val) {
        this.value=val;
        this.left=this.right=null;
    }
}
public class BinaryTreeRight {
    public List<Integer> rightView(TreeNode root) {
        List<Integer> rightViewList=new ArrayList<>();
        if (root==null){
            return rightViewList;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            for (int i=0;i<levelSize;i++) {
                TreeNode node=queue.poll();
                if (i==levelSize-1) {
                    rightViewList.add(node.value);
                }
                if (node.left!=null) {
                    queue.add(node.left);
                }
                if (node.right!=null) {
                    queue.add(node.right);
                }
            }
        }
        return rightViewList;
    }
    public static void main(String[] args) {
        BinaryTreeRight tree=new BinaryTreeRight();
        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);
        root1.left.right=new TreeNode(4);
        root1.right.right=new TreeNode(5);
        System.out.println("Tree1: "+tree.rightView(root1));
    }
}
