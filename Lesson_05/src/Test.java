public class Test {
    public static void main(String[] args) {
        int n = 13;
        String rs = n%2 != 0 ? (isPrimeNumber(n) ? "Là số nguyên tố" : " Không là số nguyên tố"):"Không chia hết cho 2";
        System.out.println(rs);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
