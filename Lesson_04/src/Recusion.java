public class Recusion {

    public static void main(String[] args) {
//        int rs = factorial(5);
//        System.out.println(rs);

        for(int i = 0; i < 10; i++){
            //System.out.println(fibonacciRecusion(i));

            System.out.println(fibonacci(i));
        }
    }

    public static int factorial(int n){

        int result = 0;

        if(n != 0){
            //công thức đệ quy
            result = n * factorial(n-1);
        }else {
            //Điều kiện dừng
            result = 1;
        }

        return  result;
    }

    public static int fibonacciRecusion(int n){ //n số finbonaci thứ n
        if(n < 0){
            return  -1;
        }else if(n == 0 || n == 1){
            return n;
        }else {
            return fibonacciRecusion(n-1) + fibonacciRecusion(n-2);
        }

    }

    public static int fibonacci(int n){
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        if(n < 0){
            return -1;
        }
        else if(n == 0 || n == 1){
            return n;
        }else {
            for(int i = 2; i < n; i++){
                f0 = f1;
                f1 = f2;
                f2 = f0 + f1;
            }
        }
        return f2;
    }


}
