public class ArrayQueue implements  IStackQueue {

    private int[] arr;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(int size) {
        this.size = size;
        arr = new int[size];
        head = -1;
        tail = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            if(isEmpty()){
                head++;
            }
            tail++;
            arr[tail] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }else {
            int value = arr[head];
            head++;
            if(head > tail){
                head = tail = -1;
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
        return tail == size - 1;
    }

    @Override
    public boolean isEmpty() {

        return (head == -1) && (tail == -1);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Queue rỗng");
        }else {
            for(int i = head; i <= tail; i++){
                System.out.print(arr[i] +"\t");
            }
            System.out.println();
        }
    }
}
