public class _7_Reverse_Integer {
    public static void main(String[] args) {

        int n = 1234567899;

        System.out.println(reverse(n));

    }

    public static int reverse(int x) {
        if(x < 10 && x > -10){
            return x;
        }
        int reverse = 0;
        int lastReverse = 0;

        boolean isCheck = x < 0;

        if(isCheck){
            x = x * -1;
        }
        while (x > 0){
            lastReverse = reverse;
            reverse = reverse*10 + x%10;

            if(lastReverse > reverse/10){
                return 0;
            }
            x = x/10;

            System.out.println(reverse);
        }

        if(isCheck){
            return reverse * -1;
        }

        return reverse;
    }
}
