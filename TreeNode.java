
public class TreeNode {

    private String word;
    private int counter;
    TreeNode leftChild, rightChild;

    public TreeNode(String word) {
        this.word = word;
        counter = 1;
        leftChild = null;
        rightChild = null;
    }

    public void increaseCounter() {
        counter++;
    }

    @Override
    public String toString() {
        return "Ord: " + word + "\t counter: " + counter;
    }

    public String getWord() {
        return word;
    }

    public int getCounter() {
        return counter;
    }

}
