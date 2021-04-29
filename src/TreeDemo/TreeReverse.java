package TreeDemo;

//二叉树镜像
public class TreeReverse {
    public void Mirror(TreeNode node){
        if(node==null){
            return;
        }
        if(node.left==null&&node.right==null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        Mirror(node.left);
        Mirror(node.right);
    }
}
