import java.util.Arrays;

public class _1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        System.out.println("Start");
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        int[] result = twoSum(nums, target);

        for (int i : result){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
