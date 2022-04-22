import java.util.Arrays;

public class _1051_Height_Checker {

    public static int heightChecker(int[] heights) {
        int[] arr = heights.clone();

        Arrays.sort(arr);

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [] heights = {5,1,2,3,4};
        int count = heightChecker(heights);
        System.out.println(count);
    }
}
