
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
            System.out.println(currentNode);
        }
        else if ( word.compareTo( currentNode.getWord()) < 0 ){
            currentNode.leftChild = insert(currentNode.leftChild, word);
        }
        else if ( word.compareTo( currentNode.getWord()) == 0 ) {
            currentNode.increaseCounter();
            System.out.println(currentNode);
        }
        else {
            currentNode.rightChild = insert(currentNode.rightChild, word);
        }

        return currentNode;
    }

    public void printRoot() {
        System.out.println(root);
    }

}
