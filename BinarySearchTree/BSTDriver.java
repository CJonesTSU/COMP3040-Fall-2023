public class BSTDriver{
    public static void main(String[] args){
        Node test = new Node(7);
        BinarySearchTree bst = new BinarySearchTree();
        bst.Insert(78);
        bst.Insert(35);
        bst.Insert(23);
        bst.Insert(100);
        bst.Insert(50);
        bst.Insert(42);

        // Check our traversal methods
        System.out.println("Printing InOrder");
        bst.Inorder(bst.root);

        System.out.println("\n\nPrinting PreOrder");
        bst.preOrder(bst.root);

        System.out.println("\n\nPrinting PostOrder");
        bst.postOrder(bst.root);

        System.out.println("\n\nSearch for '23'");
        System.out.println(bst.search(23));

        System.out.println("The code ran");
    }    
}