
public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(String word) {
        root = insert(root, word);
    }

    private TreeNode insert(TreeNode currentNode, String word) {
        if (currentNode == null) {
            currentNode = new TreeNode(word);
        }
        else if ( word.compareTo( currentNode.getWord()) < 0 ){
            currentNode.setLeftChild( insert(currentNode.getLeftChild(), word) );
        }
        else if ( word.compareTo( currentNode.getWord()) == 0 ) {
            currentNode.increaseCounter();
        }
        else {
            currentNode.setRightChild( insert(currentNode.getRightChild(), word) );
        }

        return currentNode;
    }

    public void printInorder() {
        printInorder(root);
    }

    private void printInorder(TreeNode currentNode) {
        if (currentNode == null) {
            return;
        }

        printInorder(currentNode.getLeftChild());
        System.out.println(currentNode);
        printInorder(currentNode.getRightChild());
    }

}
