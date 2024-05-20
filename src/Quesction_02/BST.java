package Quesction_02;

public class BST {
    private  TreeNode root;

    public BST() {
        this.root = new TreeNode(new CharctorCode('/'," "));
    }

    public void addElement(char character, String code){
        TreeNode newNode=new TreeNode(new CharctorCode(character,code));
        this.root=insert(this.root,newNode,0);
    }
    private TreeNode insert(TreeNode root, TreeNode newNode,int index){
        if(root ==null){
            return newNode;
        }else if(newNode.data.getCharacterCode().charAt(index)=='0'){
            root.left=insert(root.left,newNode,++index);
        }else if(newNode.data.getCharacterCode().charAt(index)=='1'){
            root.right=insert(root.right,newNode,++index);
        }
        return root;
    }
    public void inorder(){
        System.out.println();
        inorderTraversal(this.root);
    }
    private void inorderTraversal(TreeNode root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.data.getCharacter()+" ");
            inorderTraversal(root.right);
        }
    }



}
