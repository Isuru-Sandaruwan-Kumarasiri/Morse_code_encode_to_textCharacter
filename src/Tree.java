

public class Tree {

    private TreeNode root;

    public Tree() {
        this.root = null;
    }


    public void insert(CharCode charNode){
        TreeNode newNode=new TreeNode(charNode);
        this.root=insertNode(this.root,newNode,0);
    }
    private TreeNode insertNode(TreeNode root,TreeNode newNode,int level){
        if(root ==null){
            return newNode;
        } else if (newNode.data.getCode().charAt(level)=='.') {
            root.left=insertNode(root.left,newNode,++level);
        } else if (newNode.data.getCode().charAt(level)=='-') {
            root.right=insertNode(root.right,newNode,++level);
        }
        return root;
    }
}
