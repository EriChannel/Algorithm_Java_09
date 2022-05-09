import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //LinkedList
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2; //Nối n1 đến n2
        n2.next = n3; //Nối n2 đến n3

        print(n1);

        //print(n2);

//        Node newNode = addAtHead(n1, 0);
//        print(newNode);
        n1 = addAtHead(n1, 0);
        print(n1);



//        Node newList = addAtTail(n1, 4);
//        print(newList);
        n1 = addAtTail(n1, 4);
        print(n1);
        n1 = addToIndex(n1, 5, 3);
        print(n1);

        n1 = addToIndex(n1, 6, 10);
        print(n1);

        n1 = removeAtHead(n1);
        print(n1);

        n1 = removeAtTail(n1);
        print(n1);

        n1 = removeAtIndex(n1, 2);
        print(n1);
    }

    public static void print(Node headNode){
        if(headNode == null){
            System.out.println("LinkedList rỗng!!!");
        }else{
            Node temp = headNode;
            while (temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }

    //Thêm node mới vào đầu linkedlist
    public static Node addAtHead(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

    //Them vào cuối LinkedList
    public static Node addAtTail(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode == null){
            return newNode;
        }else{
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }

        return headNode;
    }

    //Thêm vào vị trí chỉ định (index)

    public static Node addToIndex(Node headNode, int value, int index){
        if(index == 0){
            return addAtHead(headNode, value);
        }else{
            Node newNode = new Node(value);
            Node temp = headNode;
            int count = 0;
            while (temp.next != null){
                count++;
                if(count == index){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }

                temp = temp.next;
            }
        }

        return headNode;
    }

    //Xóa node đầu
    public static Node removeAtHead(Node headNode){
        if(headNode != null){
            headNode = headNode.next;
        }
        return headNode;
    }

    //Xóa node cuối
    public static Node removeAtTail(Node headNode){
        if(headNode == null){
            return null;
        }

        Node lastNode = headNode;
        Node preNode = null;

        while(lastNode.next != null){
            preNode = lastNode;
            lastNode = preNode.next;
        }

        if (preNode == null){
            return null;
        }else {
            preNode.next = lastNode.next;
        }


        return headNode;
    }

    //Xóa node ở index chỉ định

    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null){
            return null;
        }

        if(index == 0){
            return removeAtHead(headNode);
        }

        Node temp = headNode;
        Node preNode = null;

        int count = 0;

        while (temp != null){
            if(count == index){
                preNode.next = temp.next;
                break;
            }

            count++;
            preNode = temp;
            temp = preNode.next;
        }

        return headNode;
    }
}
