package BInaryTree;

class Node{
    int item;
    Node left, right;

    public Node(int key){
        item = key;
        left = right = null;
    }
}

class PreOrder{
    Node root;
    PreOrder(){
        root = null;
    }
    void temp(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.item + "->");
        temp(node.left);
        temp(node.right);
    }
    public static void main(String[] args){
        PreOrder tree  = new PreOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.temp(tree.root);
    }
}
