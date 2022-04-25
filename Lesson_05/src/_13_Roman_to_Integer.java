import java.util.Arrays;

public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int[] arr = stringToArray(s);
        System.out.println(Arrays.toString(arr));

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int[] arr = stringToArray(s);
        int i = arr.length - 1;

        while (i >= 0){
            //if(){
                if(i - 1 >= 0 && arr[i] > arr[i - 1] ){
                    sum  += arr[i] - arr[i-1];
                    i--;
                }else {
                    sum += arr[i];
                }
            //}
            i--;
        }
        return sum;
    }

    public static int[] stringToArray(String s){
        int[] arr = new int[s.length()];

        for(int i = 0; i < arr.length; i++){
            char ch = s.charAt(i);
            if(ch == 'I') arr[i] = 1;
            if(ch == 'V') arr[i] = 5;
            if(ch == 'X') arr[i] = 10;
            if(ch == 'L') arr[i] = 50;
            if(ch == 'C') arr[i] = 100;
            if(ch == 'D') arr[i] = 500;
            if(ch == 'M') arr[i] = 1000;


//            switch (ch){
//                case 'I':
//                    arr[i] = 1;
//                    break;
//                case 'V':
//                    arr[i] = 5;
//                    break;
//                case 'X':
//                    arr[i] = 10;
//                    break;
//                case 'L':
//                    arr[i] = 50;
//                    break;
//                case 'C':
//                    arr[i] = 100;
//                    break;
//                case 'D':
//                    arr[i] = 500;
//                    break;
//                case 'M':
//                    arr[i] = 1000;
//                    break;

          //  }
        }

        return arr;
    }
}
