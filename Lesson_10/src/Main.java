public class Main {
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(5);

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());

        System.out.println("Thêm phần tử: ");
        System.out.println(myStack.push(1));
        System.out.println(myStack.push(2));
        System.out.println(myStack.push(3));

        myStack.print();

        System.out.println(myStack.push(4));
        System.out.println(myStack.push(5));

        myStack.print();

//        System.out.println("Kiểm tra rỗng: "+myStack.isEmpty());
//        System.out.println("Kiểm tra full: " +myStack.isFull());
//
//        System.out.println(myStack.push(6));

        System.out.println("Phần tử đầu tiên: " + myStack.peek());

        System.out.println(myStack.pop());
        System.out.println("Phần tử đầu tiên: " + myStack.peek());

        myStack.print();

        System.out.println(myStack.pop());

        myStack.print();

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        /*
        LinkedListStack stack = new LinkedListStack();
        System.out.println(stack.isEmpty());

        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));

        stack.print();
        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        */

        /*
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));
        System.out.println(queue.push(4));
        System.out.println(queue.push(5));

        queue.print();

        System.out.println("Queue đầy: "+queue.isFull());

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println("Queue rỗng: " +queue.isEmpty());

         */

        /*
        LinkedListQueue queue = new LinkedListQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));
        queue.print();
        System.out.println("Queue rỗng : " + queue.isEmpty());

        System.out.println(queue.pop());

        queue.print();
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println("Queue rỗng : " + queue.isEmpty());*/
    }
}
