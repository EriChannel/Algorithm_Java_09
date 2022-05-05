import java.util.Arrays;

public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

//        int[] rs = replaceElements(arr);
        int []rs = replaceElements1(arr);
        System.out.println(Arrays.toString(rs));
    }

    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < result.length; i++){
            result[i] = findMax(arr, i+1);
        }
        return result;
    }

    public static int findMax(int[] arr, int startIndex){
        if(startIndex == arr.length){
            return -1;
        }
        int max = arr[startIndex];
        for(int i = startIndex; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] replaceElements1(int[] arr){
        int n = arr.length;
        int[] rs = new int[n];

        int lastElement = arr[n-1];

        rs[n-1] = -1;

        for(int i = n - 2; i >= 0; i--){
            rs[i] = lastElement;
            if(lastElement < arr[i]){
                lastElement = arr[i];
            }
        }

        return rs;
    }
}
