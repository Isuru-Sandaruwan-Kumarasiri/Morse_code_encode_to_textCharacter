package Quesction_02;

public class Driver {
    public static void main(String[] args) {
        char [] chars={'e','t','o','l','y','r','i','u','v','n','d','a','s','h','g','x','w','p','b','z','q','m','k','j','f','c'};
        String [] strings={"0","00","01","000","001","010","011","0000","0001","0010","0011","0100","0101","1","10","11","100","101","110","111","1000","1001","1010","1011","1100","1101"};

        BST bst=new BST();
        int i=0;
        for (char a :chars){
            bst.addElement(a,strings[i]);
            i++;
        }

        bst.inorder();

//        bst.addElement('a',"001");
    }
}
