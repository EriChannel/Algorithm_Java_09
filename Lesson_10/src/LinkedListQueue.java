public class LinkedListQueue implements IStackQueue {

    Node headNode;
    Node tailNode;


    public LinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            Node newNode = new Node(value);
            if(isEmpty()){
                headNode = newNode;
                tailNode = newNode;
            }else{
                tailNode.next = newNode;
                tailNode = newNode;
            }
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }else{
            int value = headNode.value;
            if(headNode == tailNode){
                headNode = tailNode = null;
            }else{
                headNode = headNode.next;
            }
            return value;
        }
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null) && (tailNode ==null);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Queue rỗng");
        }else{
            Node temp = headNode;
            while (temp != null){
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
