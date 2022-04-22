import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int[] arrClone = new int[arr.length];

        for(int i = 0, j = 0; i < arr.length && j < arr.length; i++, j++){
            if(arr[i] == 0){
                arrClone[j] = arr[i];
                j++;
            }

            if(j >= arr.length){
                break;
            }
            arrClone[j] = arr[i];
        }



        int k = 0;
        for(int i : arrClone){
            arr[k] = i;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        //--> 1, 0, 0 , 2, 3, 0 ,0, 4
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
