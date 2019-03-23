import com.sun.source.tree.BinaryTree;

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
            System.out.println(root);
        }
        else if (word < currentNode.getWord()) {

        }

        return currentNode;
    }

    public void printRoot() {
        System.out.println(root);
    }

}
