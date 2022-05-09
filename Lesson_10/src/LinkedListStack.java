import java.util.ArrayList;

public class LinkedListStack implements IStackQueue{

    Node topNode;

    public LinkedListStack() {
        this.topNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }

        return false;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }else {
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Stack rỗng");
        }else{
            Node temp = topNode;
            ArrayList<Integer> list = new ArrayList<>();
            while (temp != null){
                list.add(temp.value);
                temp = temp.next;
            }

            for(int i = list.size() - 1; i >= 0; i--){
                System.out.print(list.get(i) + "\t");
            }

            System.out.println();
        }


    }
}
