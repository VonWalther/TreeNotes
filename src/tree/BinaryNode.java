package tree;

public class BinaryNode<D> {
    private D data;
    private BinaryNode<D> left;
    private BinaryNode<D> right;

    public BinaryNode(D data){
        this.data = data;
    }

    public BinaryNode(D data, BinaryNode<D> left, BinaryNode<D> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
