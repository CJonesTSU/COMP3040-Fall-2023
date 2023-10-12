public class BinarySearchTree{
    Node root;
    
    public BinarySearchTree(){
        root = null;
    }

    public void Insert(int data){
        root = Insert(root,data);
    }

    public Node Insert(Node node, int data){
        if (node == null){
            node = new Node(data);
        } else {
            if(data <= node.data)
                node.left = Insert(node.left, data);
            else
                node.right = Insert(node.right, data);
        }
        return node;
    }

    public void Inorder(Node localRoot){
        if (localRoot != null){
            Inorder(localRoot.left);
            System.out.print(localRoot.data + " ");
            Inorder(localRoot.right);
        }
    }

    public void preOrder(Node localRoot){
        if(localRoot != null){
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    public void postOrder(Node localRoot){
        if(localRoot != null){
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.data + " ");            
        }        
    }

    public Node search(int key){
        Node temp = root;

        while(temp != null && temp.data != key){
            if (key > temp.data){
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return temp;
    }
}