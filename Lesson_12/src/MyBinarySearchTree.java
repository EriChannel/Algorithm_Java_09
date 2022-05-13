public class MyBinarySearchTree {

    TreeNode root;

    public TreeNode insert(TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
        if(root == null){
            root = newNode;
            return root;
        }else{
            TreeNode temp = root;

            while (true){
                if (value < temp.value){ //Node mới có giá trị nhỏ hơn node hiện tại
                    if (temp.left == null){
                        temp.left = newNode;
                        break;
                    }else {
                        temp = temp.left;
                    }
                }else{ //Node mới có giá trị lớn hơn node hiện tại
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else {
                        temp = temp.right;
                    }
                }
            }
        }

        return root;
    }

    public TreeNode remove(TreeNode root, int key){
        if(root == null){
            return null;
        }

        //Tìm node cần xóa

        while (true){
            if(key < root.value){ //Node cần xóa nằm ở phía bên trái
               root.left = remove(root.left, key);
            }else if(key > root.value){ //Node cần xóa nằm phía bên phải
                root.right = remove(root.right, key);
            }else{ //Đã tìm được node cần xóa
                //TH: node cần xóa không có node con
                System.out.println(root.value);
                if(root.left == null && root.right == null){
                    return null;
                }

                //TH: Node cần xóa có 1 node con
                if(root.left != null && root.right == null){ //Node con nằm bên trái
                    return root.left;
                }
                if(root.left == null && root.right != null){
                    return root.right;
                }



                //TH: Node cần xóa có 2 node con
                //B1: Tìm node lớn nhất phía bên trái node cần xóa
                TreeNode leftNode = findLeftNode(root.left);
                root.value = leftNode.value;
                root.left = remove(root.left, leftNode.value);

            }
            return root;
        }
    }

    public TreeNode findLeftNode(TreeNode root){
        TreeNode temp = root;
        if(temp.right != null){
            temp = temp.right;
        }

        return temp;
    }

    //Duyệt tiền thứ tự
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        //Duyệt gốc
        System.out.print(root.value + "\t");
        //Duyệt bên trái
        preOrder(root.left);
        //Duyệt bên phải
        preOrder(root.right);
    }

    //Duyệt trung thứ tự
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        //Duyệt bên trái
        inOrder(root.left);
        //Duyệt gốc
        System.out.print(root.value +"\t");
        //Duyệt bên phải
        inOrder(root.right);
    }

    //Duyệt hậu thứ tự
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        //Duyệt bên trái
        postOrder(root.left);
        //Duyệt bên phải
        postOrder(root.right);
        //Duyệt gốc
        System.out.print(root.value +"\t");
    }
}
