public class ArrayStack implements IStackQueue {

    private int[] arr;
    private int size;
    private int topIndex;

    public ArrayStack(int size) {
        this.size = size;
        arr = new int[this.size];
        this.topIndex = -1; //Mảng đang rỗng, khi thêm 1 phần tử thì topIndex tăng 1
    }

    //Kiểm tra stack có rỗng hay không
    @Override
    public boolean isEmpty(){
        return topIndex < 0;
    }

    //Kiểm tra stack có đầy hay không
    @Override
    public boolean isFull(){
        return topIndex == this.size-1;
    }

    //Thêm phần tử vào stack

    @Override
    public boolean push(int value){
        if (!isFull()) {
            topIndex++;
            arr[topIndex] = value;
            return true;
        }

        return false;
    }

    //Lấy phần tử ra
    @Override
    public int pop(){
        if(isEmpty()){
            return -1;
        }else {
            int value = arr[topIndex];
            topIndex--;
            return value;
        }
    }

    @Override
    public void print(){
        if(isEmpty()){
            System.out.println("Stack rỗng");
        }else {
            for(int i = 0; i <= topIndex; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
}
